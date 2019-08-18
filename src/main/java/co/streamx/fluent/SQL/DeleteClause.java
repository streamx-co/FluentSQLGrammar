package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface DeleteClause extends Clause {
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM_WITHOUT_ALIAS, parameterContextCapabilities = Capability.ALIAS_DELETE)
    DeleteUsing FROM(Object tableReference);
}
