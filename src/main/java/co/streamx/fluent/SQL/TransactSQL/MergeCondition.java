package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.notation.Function;

public interface MergeCondition {
    @Function(omitParentheses = true)
    void ON(boolean condition);
}
