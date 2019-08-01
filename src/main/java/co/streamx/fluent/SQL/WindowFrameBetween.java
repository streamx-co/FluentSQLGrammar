package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface WindowFrameBetween {
    @Function(omitParentheses = true, omitArgumentsDelimiter = true)
    WindowFrameAnd BETWEEN(Comparable<?> offset,
                           FrameBounds bounds);

    @Function(omitParentheses = true)
    WindowFrameAnd BETWEEN(FrameBounds bounds);
}
