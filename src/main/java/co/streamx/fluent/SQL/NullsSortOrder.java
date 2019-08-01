package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface NullsSortOrder extends SortOrder {
    @Function(omitParentheses = true)
    SortOrder NULLS_FIRST();

    @Function(omitParentheses = true)
    SortOrder NULLS_LAST();
}
