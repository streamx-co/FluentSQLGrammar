package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface WindowFrameExclusion extends WindowDef {
    @Function(omitParentheses = true)
    WindowDef EXCLUDE_CURRENT_ROW();

    @Function(omitParentheses = true)
    WindowDef EXCLUDE_GROUP();

    @Function(omitParentheses = true)
    WindowDef EXCLUDE_TIES();

    @Function(omitParentheses = true)
    WindowDef EXCLUDE_NO_OTHERS();
}
