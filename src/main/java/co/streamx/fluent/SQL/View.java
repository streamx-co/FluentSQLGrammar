package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Tuple;
import co.streamx.fluent.notation.ViewDeclaration;

@Tuple
public interface View<T> {

    /**
     * Generates a select row of the view columns from the entity originally used to create this view.
     */
    @Function(name = "")
    @ViewDeclaration.Select
    Record<T> select();

    /**
     * Generates a select row of the view columns from the passed entity.
     */
    @Function(name = "")
    @ViewDeclaration.Select
    Record<T> select(T entity);

    /**
     * Generates column names (declaration, e.g. for INSERT)
     */
    @Function(name = "")
    @ViewDeclaration.Columns
    ColumnsClause<T> columnNames();
}
