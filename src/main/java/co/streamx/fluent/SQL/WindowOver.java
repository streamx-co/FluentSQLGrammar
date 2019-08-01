package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface WindowOver<CONTINUATION extends Comparable<? super CONTINUATION>> {

    // @Function
    // CONTINUATION OVER(String windowDefinitionName);

    @Function
    Value<CONTINUATION> OVER(WindowDef windowDefinition);
}
