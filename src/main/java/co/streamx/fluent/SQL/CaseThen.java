package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface CaseThen<T> {
    @Function(omitParentheses = true)
    CaseWhen<T> THEN(T t);
}
