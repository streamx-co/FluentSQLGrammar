package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.notation.Function;

public interface MergeUsing {
    @Function(omitParentheses = true)
    MergeCondition USING(Object sourceTableReference);
}
