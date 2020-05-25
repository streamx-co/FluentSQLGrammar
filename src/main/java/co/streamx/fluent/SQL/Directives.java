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
import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.CommonTableExpression;
import co.streamx.fluent.notation.CommonTableExpressionType;
import co.streamx.fluent.notation.Context;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Keyword;
import co.streamx.fluent.notation.Local;
import co.streamx.fluent.notation.NoOp;
import co.streamx.fluent.notation.Operator;
import co.streamx.fluent.notation.Parameter;
import co.streamx.fluent.notation.ParameterContext;
import co.streamx.fluent.notation.SubQuery;
import co.streamx.fluent.notation.TableExtension;
import co.streamx.fluent.notation.ViewDeclaration;

public interface Directives {

    @SafeVarargs
    @CommonTableExpression(CommonTableExpressionType.DECORATOR)
    @Function(name = "", omitParentheses = true, parameterContext = ParameterContext.FROM_WITHOUT_ALIAS, parameterContextCapabilities = Capability.ALIAS_INSERT)
    @Operator
    @ViewDeclaration
    static <T> View<T> viewOf(T tableReference,
                              @Context(ParameterContext.ALIAS) Function1<T, Comparable<?>>... columns) {
        throw new UnsupportedOperationException();
    }

    /**
     * Specifies a table to recurse in recursive CTE
     */
    @CommonTableExpression(CommonTableExpressionType.SELF)
    static <T> T recurseOn(T commonTableExpression) {
        throw new UnsupportedOperationException();
    }

    /**
     * Reference the CTE which will be declared later. Useful in cases where multiple CTEs are defined and one refers
     * another. Since at the point of referral the referred CTE is not declared with {@link SQL#WITH(Object...) WITH},
     * this method should be used to avoid duplicate declaration.
     */
    @CommonTableExpression(CommonTableExpressionType.REFERENCE)
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
    static <T, T1> co.streamx.fluent.SQL.Alias<T> alias(T field,
                                                        @Context(ParameterContext.ALIAS) Function1<T1, T> alias) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an alias
     */
    @Alias
    static <T extends Comparable<? super T>, T1> T alias(T field,
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
     * Use previously created alias outside of SELECT to beautify the produced SQL. (Inside SELECT it's used
     * automatically, where it actually has an effect).
     */
    @Alias.Use
    static <T> T aliasOf(T expression) {
        throw new UnsupportedOperationException();
    }

    /**
     * Discards SQL generated by the {@code statements}.
     */
    @NoOp
    @Function
    static void discardSQL(Object... statements) {
        throw new UnsupportedOperationException();
    }

    /**
     * Include the passed {@code sql} as is.
     */
    @Local
    static Keyword injectSQL(String sql) {
        return new Keyword() {
            @Override
            public String toString() {
                return sql;
            }
        };
    }

    @Function(name = "--", omitParentheses = true)
    static void comment(Object... statements) {
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

    /**
     * Register an argument as a query parameter
     */
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

    /**
     * Prepends an additional element to an existing {@code varargs} array. Useful for constructing varargs for
     * <a href="https://github.com/streamx-co/FluentJPA/wiki/Dynamic-Queries">Dynamic Queries</a>.
     */
    @Function(name = "", omitParentheses = true)
    static <T extends Comparable<?>> T[] varargs(T prepend,
                                                 Comparable<?>... args) {
        throw new UnsupportedOperationException();
    }

    /**
     * Generates a filter based on {@code @DiscriminatorColumn and @DiscriminatorValue}
     */
    @TableExtension.DiscriminatorFilter
    static <T, D extends T> boolean typeOf(T baseEntity,
                                           D derived) {
        throw new UnsupportedOperationException();
    }

    /**
     * Generates a filter based on {@code @DiscriminatorColumn and @DiscriminatorValue}
     */
    @TableExtension.DiscriminatorFilter
    static <T, D extends T> boolean typeOf(T baseEntity,
                                           Class<D> derived) {
        throw new UnsupportedOperationException();
    }

    /**
     * Internal helper method for {@link View#from(Iterable)}
     */
    @Local
    static <T> Function1<View<T>, Record<T>[]> from(Iterable<T> batch) {
        Function1<View<T>, Record<T>[]> result = Function1.emptyArray();

        for (T item : batch) {
            Function1<View<T>, Record<T>[]> current = result;
            result = view -> varargs(view.from(parameter(item)), current.apply(view));
        }

        return result;
    }
}
