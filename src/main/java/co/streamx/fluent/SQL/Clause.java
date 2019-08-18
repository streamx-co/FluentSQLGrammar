package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface Clause {
    @Function(name = "", omitParentheses = true)
    default void printSQL() {
    }
}
