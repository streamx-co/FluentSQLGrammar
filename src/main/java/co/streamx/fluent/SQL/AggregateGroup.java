package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface AggregateGroup<CONTINUATION extends Comparable<? super CONTINUATION>>
        extends AggregateFilter<CONTINUATION> {

    @Function
    AggregateFilter<CONTINUATION> WITHIN_GROUP(WindowFrame orderByClause);
}
