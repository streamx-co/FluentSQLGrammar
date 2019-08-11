package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface Trim {
    @Function(omitParentheses = true)
    String FROM(String expression);
}
