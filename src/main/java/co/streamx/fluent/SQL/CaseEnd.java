package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface CaseEnd<T> {
    @Function(omitParentheses = true)
    T END();
}
