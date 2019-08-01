package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface ConflictAction<T> {
    @Function(omitParentheses = true)
    void DO_NOTHING();

    @Function(omitParentheses = true)
    UpdateSet<T> DO_UPDATE();
}
