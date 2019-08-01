package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface DeleteUsing extends Clause {
    @Function(omitParentheses = true)
    Clause USING(Object... tables);
}
