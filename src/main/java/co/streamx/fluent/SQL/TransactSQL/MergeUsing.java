package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface MergeUsing {
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM)
    MergeCondition USING(Object sourceTableReference);
}
