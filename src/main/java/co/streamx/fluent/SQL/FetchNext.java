package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface FetchNext {
    @Function(omitParentheses = true)
    Fetch FETCH_NEXT(int rowCount);
}
