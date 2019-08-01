package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface LockingClause extends LockWaitingMode {

    @Function(omitParentheses = true)
    LockWaitingMode OF(Object... tables);
}
