package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.notation.Function;

public interface MergeClause {
    @Function(omitParentheses = true)
    MergeUsing INTO(Object targetTableReference);
}
