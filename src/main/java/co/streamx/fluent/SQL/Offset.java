package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface Offset {
    @Function(omitParentheses = true)
    void ROWS();
}
