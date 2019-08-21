package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.notation.Function;

public interface TopClause extends WithTiesClause {
    @Function(omitParentheses = true)
    WithTiesClause PERCENT();
}
