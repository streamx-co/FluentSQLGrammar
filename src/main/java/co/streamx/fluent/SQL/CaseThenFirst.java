package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Consumer0;
import co.streamx.fluent.functions.Consumer1;
import co.streamx.fluent.notation.Function;

public interface CaseThenFirst {
    @Function(omitParentheses = true)
    <T> CaseWhen<T> THEN(T t);

    @Function(omitParentheses = true)
    CaseWhen<Consumer0> THEN(Consumer0 subQuery);

    @Function(omitParentheses = true)
    <T> CaseWhen<Consumer1<T>> THEN(Consumer1<T> subQuery);
}
