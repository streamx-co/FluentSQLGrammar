package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface InsertClause {
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM_WITHOUT_ALIAS, parameterContextCapabilities = Capability.ALIAS_INSERT)
    Clause INTO(Object tableReference);
}
