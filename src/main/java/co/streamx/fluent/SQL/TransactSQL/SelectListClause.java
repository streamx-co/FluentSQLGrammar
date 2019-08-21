package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.SQL.Record;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;

public interface SelectListClause {
    @Function(name = "", omitParentheses = true)
    <R extends Record<?>> R of(Comparable<?>... expressions);

    @Function(name = "", omitParentheses = true, parameterContext = ParameterContext.SELECT)
    <R extends Record<?>> R of(Object expression,
                               Comparable<?>... expressions);
}
