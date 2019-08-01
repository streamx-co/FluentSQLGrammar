package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface ConflictActionWithConstraint<T> extends ConflictAction<T> {
    @Function(omitParentheses = true)
    ConflictAction<T> ON_CONSTRAINT(String name);
}
