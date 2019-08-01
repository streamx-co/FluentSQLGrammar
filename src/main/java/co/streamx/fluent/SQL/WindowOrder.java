package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface WindowOrder extends WindowFrame {
    @Function(name = "ORDER BY", omitParentheses = true)
    WindowFrame ORDER(SortOrder... sorts);
}
