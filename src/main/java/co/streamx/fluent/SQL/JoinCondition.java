package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public abstract class JoinCondition<T> {
    @Function(omitParentheses = true)
    public abstract JoinClause ON(boolean condition);

    @SafeVarargs
    @Function(parameterContext = ParameterContext.ALIAS)
    public final JoinClause USING(Function1<T, Comparable<?>>... columns) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    public abstract JoinClause NATURAL();
}
