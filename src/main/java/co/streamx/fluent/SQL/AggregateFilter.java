package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface AggregateFilter<CONTINUATION extends Comparable<? super CONTINUATION>>
        extends WindowOver<CONTINUATION> {

    @Function
    WindowOver<CONTINUATION> FILTER(WhereClause filterClause);
}
