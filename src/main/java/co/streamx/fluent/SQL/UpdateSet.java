package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Consumer0;
import co.streamx.fluent.notation.Function;

public interface UpdateSet<T> {

    @Function(omitParentheses = true)
    Clause SET(Consumer0 sql);
}
