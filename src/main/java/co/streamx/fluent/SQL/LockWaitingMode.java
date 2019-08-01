package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface LockWaitingMode {

    @Function(omitParentheses = true)
    void NOWAIT();

    @Function(omitParentheses = true)
    void SKIP_LOCKED();
}
