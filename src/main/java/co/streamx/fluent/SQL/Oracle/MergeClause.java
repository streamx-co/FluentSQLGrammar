package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.notation.Function;

public interface MergeClause {
    @Function(omitParentheses = true)
    MergeUsing INTO(Object targetTableReference);
}
