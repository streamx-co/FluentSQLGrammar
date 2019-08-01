package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface GroupByClause {

    /**
     * Use {@link SQL#ROLLUP(Object...)}, if supported by the DB vendor
     */
    @Deprecated
    @Function(omitParentheses = true)
    void WITH_ROLLUP();
}
