package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface Fetch {
    @Function(name = "ROWS ONLY", omitParentheses = true)
    void ROWS();
}
