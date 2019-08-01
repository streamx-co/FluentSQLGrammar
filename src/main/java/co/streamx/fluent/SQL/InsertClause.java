package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface InsertClause {
    @Function(omitParentheses = true)
    Clause INTO(Object tableReference);
}
