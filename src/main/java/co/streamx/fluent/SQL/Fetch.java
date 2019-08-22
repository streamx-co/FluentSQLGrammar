package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface Fetch {
    @Function(omitParentheses = true)
    Clause ROWS_ONLY();

    @Function(omitParentheses = true)
    Clause ROWS_WITH_TIES();
}
