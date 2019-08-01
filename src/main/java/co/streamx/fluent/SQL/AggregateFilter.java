package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface AggregateFilter<CONTINUATION extends Comparable<? super CONTINUATION>> extends Value<CONTINUATION> {

    @Function
    Value<CONTINUATION> FILTER(WhereClause filterClause);
}
