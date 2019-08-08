package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Consumer0;
import co.streamx.fluent.functions.Consumer1;
import co.streamx.fluent.functions.Consumer10;
import co.streamx.fluent.functions.Consumer2;
import co.streamx.fluent.functions.Consumer3;
import co.streamx.fluent.functions.Consumer4;
import co.streamx.fluent.functions.Consumer5;
import co.streamx.fluent.functions.Consumer6;
import co.streamx.fluent.functions.Consumer7;
import co.streamx.fluent.functions.Consumer8;
import co.streamx.fluent.functions.Consumer9;
import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.notation.Alias;
import co.streamx.fluent.notation.BlockTerminator;
import co.streamx.fluent.notation.CommonTableExpression;
import co.streamx.fluent.notation.Context;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Operator;
import co.streamx.fluent.notation.Parameter;
import co.streamx.fluent.notation.ParameterContext;
import co.streamx.fluent.notation.SubQuery;

public interface Directives {

    @SafeVarargs
    @CommonTableExpression(decorator = true)
    @Function(name = "", omitParentheses = true)
    @Operator
    static <T> View viewOf(T tableReference,
                         @Context(ParameterContext.ALIAS) Function1<T, ?>... columns) {
        throw new UnsupportedOperationException();
    }

    /**
     * Specifies a table to recurse in recursive CTE
     */
    @CommonTableExpression(self = true)
    static <T> T recurseOn(T commonTableExpression) {
        throw new UnsupportedOperationException();
    }

    /**
     * Reference the CTE which will be declared later. Useful in cases where multiple CTEs are defined and one refers
     * another. Since at the point of referral the referred CTE is not declared with {@link SQL#WITH(Object...) WITH},
     * this method should be used to avoid duplicate declaration.
     */
    @CommonTableExpression(reference = true)
    static <T> T byRef(T commonTableExpression) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T> T subQuery(Consumer0 sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1> T subQuery(Consumer1<T1> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2> T subQuery(Consumer2<T1, T2> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3> T subQuery(Consumer3<T1, T2, T3> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3, T4> T subQuery(Consumer4<T1, T2, T3, T4> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3, T4, T5> T subQuery(Consumer5<T1, T2, T3, T4, T5> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3, T4, T5, T6> T subQuery(Consumer6<T1, T2, T3, T4, T5, T6> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3, T4, T5, T6, T7> T subQuery(Consumer7<T1, T2, T3, T4, T5, T6, T7> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3, T4, T5, T6, T7, T8> T subQuery(Consumer8<T1, T2, T3, T4, T5, T6, T7, T8> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3, T4, T5, T6, T7, T8, T9> T subQuery(Consumer9<T1, T2, T3, T4, T5, T6, T7, T8, T9> sql) {
        throw new UnsupportedOperationException();
    }

    @SubQuery
    static <T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> T subQuery(Consumer10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> sql) {
        throw new UnsupportedOperationException();
    }

    /**
     * lets specify a window frame in OVER clause
     */
    @Function(name = "", omitParentheses = true)
    static WindowFrame windowFrame() {
        throw new UnsupportedOperationException();
    }

    /**
     * Starts Window Function (OVER clause)
     */
    @Function(name = "", omitParentheses = true)
    static <T extends Comparable<? super T>> AggregateGroup<T> aggregateBy(T aggregateFunction) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an alias
     */
    @Alias
    static <T extends Comparable<? super T>> T alias(Value<T> field,
                                                     String alias) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an alias
     */
    @Alias
    static <T extends Comparable<? super T>, T1> T alias(Value<T> field,
                                                         @Context(ParameterContext.ALIAS) Function1<T1, T> alias) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an alias
     */
    @Alias
    static <T, T1> T alias(T field,
                           @Context(ParameterContext.ALIAS) Function1<T1, T> alias) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an alias
     */
    @Alias
    static <T> T alias(T fieldOrEntity,
                       String alias) {
        throw new UnsupportedOperationException();
    }

    /**
     * Prevents default table aliasing. Useful in rare vendor specific cases. E.g. see
     * <a href="https://docs.oracle.com/en/database/oracle/oracle-database/18/sqlrf/INSERT.html">Oracle INSERT
     * (Restriction on Table Aliases)</a>
     */
    @Alias(false)
    static void noAlias(Object... entities) {
        throw new UnsupportedOperationException();
    }

    @Parameter
    static <T> T parameter(T value) {
        throw new UnsupportedOperationException();
    }

    /**
     * Block terminator in SQL
     */
    @BlockTerminator
    @Function(name = ";", omitParentheses = true)
    static void semicolon() {
        throw new UnsupportedOperationException();
    }
}
