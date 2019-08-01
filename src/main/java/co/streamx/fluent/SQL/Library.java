package co.streamx.fluent.SQL;

import static co.streamx.fluent.SQL.Directives.subQuery;
import static co.streamx.fluent.SQL.SQL.FETCH;
import static co.streamx.fluent.SQL.SQL.FROM;
import static co.streamx.fluent.SQL.SQL.SELECT;
import static co.streamx.fluent.SQL.ScalarFunctions.COALESCE;

import java.util.Collection;

public interface Library {

    /**
     * Translates to {@link ScalarFunctions#COALESCE(Object...)}. Use vendor specific variant if preferred.
     */
    static <T extends Comparable<? super T>> T ISNULL(T expression1,
                                                      T expression2) {
        return COALESCE(expression1, expression2);
    }

    /**
     * Translates to {@link SQL#FETCH(long)}.ROWS(). Use vendor specific variant if preferred.
     */
    static void LIMIT(long rowCount) {
        FETCH(rowCount).ROWS();
    }

    /**
     * Translates to {@code COUNT(Keywords.ASTERISK)},<br/>
     * which translates to {@code COUNT(*)}
     */
    static int COUNT() {
        return AggregateFunctions.COUNT(Keywords.ASTERISK);
    }

    interface SafeCollection<T extends Comparable<? super T>> extends Collection<T> {
        boolean contains(T o);
    }

    /**
     * Performs a sub-query {@code SELECT <field> FROM <tableRef>}. Since the result is a table with a single column,
     * it's acceptable by operators such as {@link Operators#IN(Comparable, Collection) IN} and can be represented as
     * Java {@link Collection}.<br/>
     * <br/>
     * 
     * Out of the box FluentJPA maps {@link Collection#isEmpty()}, {@link Collection#size()} and
     * {@link Collection#contains(Object)} to the corresponding SQL functions ({@link Operators#EXISTS(Object) !EXISTS},
     * {@link AggregateFunctions#COUNT(Object) COUNT} and {@link Operators#IN(Comparable, Collection) IN}).
     * 
     * @return {@code Collection<C>}
     */
    static <TABLE, FIELD extends Comparable<? super FIELD>> SafeCollection<FIELD> collect(TABLE tableRef,
                                                                                          FIELD field) {

        return subQuery(() -> {
            SELECT(field);
            FROM(tableRef);
        });
    }

    @SafeVarargs
    static <TABLE, R extends UnboundRecord> SafeCollection<R> collectRows(TABLE tableRef,
                                                                          Object... fields) {

        return subQuery(() -> {
            SELECT(fields);
            FROM(tableRef);
        });
    }

    static <T1 extends Comparable<? super T1>, R extends Record1<T1>> SafeCollection<R> collectRows(Object tableRef,
                                                                                                    T1 expression) {
        return subQuery(() -> {
            SELECT(expression);
            FROM(tableRef);
        });
    }

    static <T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, R extends Record2<T1, T2>> SafeCollection<R> collectRows(Object tableRef,
                                                                                                                                           T1 expression1,
                                                                                                                                           T2 expression2) {
        return subQuery(() -> {
            SELECT(expression1, expression2);
            FROM(tableRef);
        });
    }

    static <T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>, R extends Record3<T1, T2, T3>> SafeCollection<R> collectRows(Object tableRef,
                                                                                                                                                                                  T1 expression1,
                                                                                                                                                                                  T2 expression2,
                                                                                                                                                                                  T3 expression3) {
        return subQuery(() -> {
            SELECT(expression1, expression2, expression3);
            FROM(tableRef);
        });
    }

    static <T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>, T4 extends Comparable<? super T4>, R extends Record4<T1, T2, T3, T4>> SafeCollection<R> collectRows(Object tableRef,
                                                                                                                                                                                                                         T1 expression1,
                                                                                                                                                                                                                         T2 expression2,
                                                                                                                                                                                                                         T3 expression3,
                                                                                                                                                                                                                         T4 expression4) {
        return subQuery(() -> {
            SELECT(expression1, expression2, expression3, expression4);
            FROM(tableRef);
        });
    }

//    @SafeVarargs
//    static <TABLE> Collection<? extends TableRow> collect(TABLE tableRef,
//                                                          Function1<TABLE, Comparable<?>>... fields) {
//
//        return subQuery(() -> {
//            SELECT(getFields(tableRef, fields));
//            FROM(tableRef);
//        });
//    }

//    @SuppressWarnings("unchecked")
//    @SafeVarargs
//    @Local
//    static <TABLE> Object[] getFields(TABLE tableRef,
//                                      Function1<TABLE, Comparable<?>>... fields) {
//        return Arrays.stream(fields).map(field -> field.apply(tableRef)).toArray(Comparable[]::new);
//    }

    /**
     * Performs a scalar sub-query {@code SELECT <field> FROM <tableRef>}. If the query returns a scalar, that is a
     * single row/column result, SQL implicitly casts it to that value. This function facilitates this behavior to Java.
     * 
     * @return {@code FIELD}
     */
    static <TABLE, FIELD extends Comparable<? super FIELD>> FIELD pick(TABLE tableRef,
                                                                       FIELD field) {

        return subQuery(() -> {
            SELECT(field);
            FROM(tableRef);
        });
    }

    /**
     * Performs a sub-query {@code SELECT <field> FROM <tableRef>}. Assuming there is a single row result, SQL
     * implicitly creates a ROW Constructor value, which is abstracted with {@link UnboundRecord}. This function
     * facilitates this behavior to Java.
     * 
     * @return {@link UnboundRecord}
     */
    @SafeVarargs
    static <R extends UnboundRecord> R pickRow(Object tableRef,
                                               Object... fields) {

        return subQuery(() -> {
            SELECT(fields);
            FROM(tableRef);
        });
    }

    static <R extends Record1<T1>, T1 extends Comparable<? super T1>> R pickRow(Object tableRef,
                                                                                T1 expression) {
        return subQuery(() -> {
            SELECT(expression);
            FROM(tableRef);
        });
    }

    static <R extends Record2<T1, T2>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>> R pickRow(Object tableRef,
                                                                                                                       T1 expression1,
                                                                                                                       T2 expression2) {
        return subQuery(() -> {
            SELECT(expression1, expression2);
            FROM(tableRef);
        });
    }

    static <R extends Record3<T1, T2, T3>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>> R pickRow(Object tableRef,
                                                                                                                                                              T1 expression1,
                                                                                                                                                              T2 expression2,
                                                                                                                                                              T3 expression3) {
        return subQuery(() -> {
            SELECT(expression1, expression2, expression3);
            FROM(tableRef);
        });
    }

    static <R extends Record4<T1, T2, T3, T4>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>, T4 extends Comparable<? super T4>> R pickRow(Object tableRef,
                                                                                                                                                                                                     T1 expression1,
                                                                                                                                                                                                     T2 expression2,
                                                                                                                                                                                                     T3 expression3,
                                                                                                                                                                                                     T4 expression4) {
        return subQuery(() -> {
            SELECT(expression1, expression2, expression3, expression4);
            FROM(tableRef);
        });
    }

    /**
     * A shortcut for<br/>
     * 
     * <pre>
     * {@code SELECT(<tableRef>);
     * FROM(<tableRef>);}
     * </pre>
     *
     * which translates to {@code SELECT tableRef.* FROM tableRef}
     */
    static void selectAll(Object tableRef) {
        SELECT(tableRef);
        FROM(tableRef);
    }

    /**
     * A shortcut for<br/>
     * 
     * <pre>
     * {@code SELECT(<tableRef>.field1, <tableRef>.field2, ...);
     * FROM(<tableRef>);}
     * </pre>
     *
     * which translates to {@code SELECT tableRef.field1, tableRef.field2, ... FROM tableRef}
     */
    @SafeVarargs
    static void selectMany(Object tableRef,
                           Object... fields) {
        SELECT(fields);
        FROM(tableRef);
    }
}
