package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.notation.Function;

public interface WithTiesClause extends SelectListClause {
    @Function(omitParentheses = true)
    SelectListClause WITH_TIES();
}
