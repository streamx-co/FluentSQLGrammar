package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface WindowFrameAnd {
    @Function(omitParentheses = true, omitArgumentsDelimiter = true)
    WindowFrameExclusion AND(Comparable<?> offset,
                             FrameBounds bounds);

    @Function(omitParentheses = true)
    WindowFrameExclusion AND(FrameBounds bounds);
}
