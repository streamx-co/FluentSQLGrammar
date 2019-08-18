package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface MergeUsing {
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM_WITHOUT_ALIAS, parameterContextCapabilities = Capability.ALIAS_INSERT)
    MergeCondition USING(Object sourceTableReference);
}
