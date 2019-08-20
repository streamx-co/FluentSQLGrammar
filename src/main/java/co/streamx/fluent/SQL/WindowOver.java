package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface WindowOver<CONTINUATION extends Comparable<? super CONTINUATION>> extends Value<CONTINUATION> {

    @Function
    CONTINUATION OVER();

    @Function
    CONTINUATION OVER(WindowDef windowDefinition);
}
