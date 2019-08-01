package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.SQL.Clause;
import co.streamx.fluent.notation.Function;

public interface ErrorsTag {
    @Function(name = "")
    Clause TAG(Comparable<?> simpleExpression);
}
