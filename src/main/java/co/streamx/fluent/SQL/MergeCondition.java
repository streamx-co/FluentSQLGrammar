package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface MergeCondition {
    @Function(omitParentheses = true)
    void ON(boolean condition);
}
