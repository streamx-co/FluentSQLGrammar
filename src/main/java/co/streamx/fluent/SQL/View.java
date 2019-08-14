package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Tuple;
import co.streamx.fluent.notation.ViewDeclaration;

@Tuple
public interface View<T> {
    @ViewDeclaration.Apply
    UnboundRecord select(T entity);
}
