package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.SQL.Keyword;
import co.streamx.fluent.notation.Function;

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
