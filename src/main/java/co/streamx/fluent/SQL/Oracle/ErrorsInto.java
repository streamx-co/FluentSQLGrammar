package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface ErrorsInto extends ErrorsTag {
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM_WITHOUT_ALIAS)
    ErrorsTag INTO(Object tableReference);
}
