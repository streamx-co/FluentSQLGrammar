package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.CommonTableExpression;
import co.streamx.fluent.notation.CommonTableExpressionType;
import co.streamx.fluent.notation.Context;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface SQL {

    @Function(omitParentheses = true, parameterContext = ParameterContext.SELECT)
    static SelectClause SELECT(Object expression,
                               Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true, parameterContext = ParameterContext.SELECT)
    static SelectClause SELECT(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static LockingClause FOR(LockStrength lockStrength) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static VersioningClause FOR(Versioning versioning) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static <R extends Record<?>> R DISTINCT(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true, parameterContext = ParameterContext.SELECT)
    static <R extends Record<?>> R DISTINCT(Object expression,
                                            Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "", omitParentheses = true)
    static <R extends Record<?>> R ALL(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "", omitParentheses = true, parameterContext = ParameterContext.SELECT)
    static <R extends Record<?>> R ALL(Object expression,
                                       Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <R extends Record1<T1>, T1 extends Comparable<? super T1>> R ROW(T1 expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <R extends Record2<T1, T2>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>> R ROW(T1 expression1,
                                                                                                                   T2 expression2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <R extends Record3<T1, T2, T3>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>> R ROW(T1 expression1,
                                                                                                                                                          T2 expression2,
                                                                                                                                                          T3 expression3) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <R extends Record4<T1, T2, T3, T4>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>, T4 extends Comparable<? super T4>> R ROW(T1 expression1,
                                                                                                                                                                                                 T2 expression2,
                                                                                                                                                                                                 T3 expression3,
                                                                                                                                                                                                 T4 expression4) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <R extends UnboundRecord> R ROW(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "")
    static <R extends Record1<T1>, T1 extends Comparable<? super T1>> R row(T1 expression) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "")
    static <R extends Record2<T1, T2>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>> R row(T1 expression1,
                                                                                                                   T2 expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "")
    static <R extends Record3<T1, T2, T3>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>> R row(T1 expression1,
                                                                                                                                                          T2 expression2,
                                                                                                                                                          T3 expression3) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "")
    static <R extends Record4<T1, T2, T3, T4>, T1 extends Comparable<? super T1>, T2 extends Comparable<? super T2>, T3 extends Comparable<? super T3>, T4 extends Comparable<? super T4>> R row(T1 expression1,
                                                                                                                                                                                                 T2 expression2,
                                                                                                                                                                                                 T3 expression3,
                                                                                                                                                                                                 T4 expression4) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "")
    static <T extends UnboundRecord> T row(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM)
    static JoinClause FROM(Object... tables) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static WhereClause WHERE(boolean condition) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "ORDER BY", omitParentheses = true)
    static WindowFrame ORDER(SortOrder... sorts) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "", omitParentheses = true)
    static By BY(Comparable<?> expression) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "PARTITION BY", omitParentheses = true)
    static WindowOrder PARTITION(By... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "GROUP BY", omitParentheses = true)
    static GroupByClause GROUP(By... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static By GROUPING_SETS(GroupingSet... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "")
    static GroupingSet SET(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @SafeVarargs
    @Function(omitParentheses = true, requiresAlias = true)
    static <R, T extends Record<R>> R VALUES(T... rows) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static <T extends Comparable<?>> T DEFAULT() {
        throw new UnsupportedOperationException();
    }

    @Function
    static GroupingSet CUBE(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static GroupingSet ROLLUP(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static void HAVING(boolean searchCondition) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Offset OFFSET(int offset) {
        throw new UnsupportedOperationException();
    }

    @CommonTableExpression(CommonTableExpressionType.DECLARATION)
    static void WITH(Object... subQueries) {
        throw new UnsupportedOperationException();
    }

    @CommonTableExpression(CommonTableExpressionType.DECORATOR)
    @Function(omitParentheses = true)
    static <T> T RECURSIVE(T CTE) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static InsertClause INSERT(Keyword... hints) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM_WITHOUT_ALIAS, parameterContextCapabilities = Capability.ALIAS_UPDATE)
    static <T> UpdateSet<T> UPDATE(T tableReference) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static void OVERRIDING_SYSTEM_VALUE() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static void OVERRIDING_USER_VALUE() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static void DEFAULT_VALUES() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T, R> ConflictAction<T> ON_CONFLICT(@Context(ParameterContext.ALIAS) Function1<T, R> alias) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T, R> ConflictActionWithConstraint<T> ON_CONFLICT() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static DeleteClause DELETE(Keyword... hints) {
        throw new UnsupportedOperationException();
    }

    // LATERAL
}
