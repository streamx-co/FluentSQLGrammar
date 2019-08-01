package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface By extends NullsSortOrder, Comparable<By> {
    @Function(omitParentheses = true)
    NullsSortOrder ASC();

    @Function(omitParentheses = true)
    NullsSortOrder DESC();

    @Function(omitParentheses = true)
    NullsSortOrder USING(String operator);
}
