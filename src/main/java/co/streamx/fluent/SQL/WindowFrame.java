package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface WindowFrame extends WindowDef {

    @Function(omitParentheses = true)
    WindowFrameBetween RANGE();

    @Function(omitParentheses = true, omitArgumentsDelimiter = true)
    WindowFrameExclusion RANGE(Comparable<?> offset,
                               FrameBounds bounds);

    @Function(omitParentheses = true)
    WindowFrameExclusion RANGE(FrameBounds bounds);

    @Function(omitParentheses = true)
    WindowFrameBetween ROWS();

    @Function(omitParentheses = true, omitArgumentsDelimiter = true)
    WindowFrameExclusion ROWS(Comparable<?> offset,
                              FrameBounds bounds);

    @Function(omitParentheses = true)
    WindowFrameExclusion ROWS(FrameBounds bounds);

    @Function(omitParentheses = true)
    WindowFrameBetween GROUPS();

    @Function(omitParentheses = true, omitArgumentsDelimiter = true)
    WindowFrameExclusion GROUPS(Comparable<?> offset,
                                FrameBounds bounds);

    @Function(omitParentheses = true)
    WindowFrameExclusion GROUPS(FrameBounds bounds);
}
