package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Consumer0;
import co.streamx.fluent.notation.Function;

public interface MatchThen {

    @Function(omitParentheses = true)
    void THEN(Consumer0 subQuery);

    @Function(omitParentheses = true)
    void THEN(Clause subQuery);
}
