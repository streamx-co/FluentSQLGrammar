package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Consumer0;
import co.streamx.fluent.functions.Consumer1;
import co.streamx.fluent.notation.Function;

public interface CaseWhen<T> extends When<T> {
    @Function(omitParentheses = true)
    CaseThen<T> WHEN(boolean condition);

    @Function(argumentsDelimiter = " THEN", omitParentheses = true)
    CaseWhen<T> WHEN(boolean condition,
                     T result);

    @Function(omitParentheses = true)
    When<T> ELSE(T expression);

    @Function(omitParentheses = true)
    When<Consumer0> ELSE(Consumer0 subQuery);

    @Function(omitParentheses = true)
    <T1> When<Consumer1<T1>> ELSE(Consumer1<T1> subQuery);
}
