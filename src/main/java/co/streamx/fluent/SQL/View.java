package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Tuple;
import co.streamx.fluent.notation.ViewDeclaration;

@Tuple
public interface View<T> {

    /**
     * Generates a {@link Record} of view columns selected <b>from</b> the entity originally used to create this view.
     */
    @Function(name = "")
    @ViewDeclaration.From
    Record<T> from();

    /**
     * Generates a {@link Record} of view columns selected <b>from</b> the passed entity.
     */
    @Function(name = "")
    @ViewDeclaration.From
    Record<T> from(T entity);

    /**
     * Generates column names (declaration, e.g. for INSERT)
     */
    @Function(name = "")
    @ViewDeclaration.Columns
    ColumnsClause<T> columnNames();

    /**
     * Generates column names (declaration, e.g. for INSERT)
     */
    @Function(name = "", omitParentheses = true)
    @ViewDeclaration.Alias
    T alias(Comparable<?>... values);
}
