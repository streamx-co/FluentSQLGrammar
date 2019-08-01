package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.notation.Function;

public interface MergeCondition {
    @Function(omitParentheses = true)
    void ON(boolean condition);
}
