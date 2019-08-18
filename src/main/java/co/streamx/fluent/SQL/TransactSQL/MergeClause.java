package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface MergeClause {
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM)
    MergeUsing INTO(Object targetTableReference);
}
