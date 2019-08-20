package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Keyword;

public interface Sequence<T extends Number> extends Keyword {
    @Function(omitParentheses = true)
    default T CURRVAL() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    default T NEXTVAL() {
        throw new UnsupportedOperationException();
    }
}
