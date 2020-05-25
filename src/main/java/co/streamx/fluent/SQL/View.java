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
     * Generates a {@link Record} of view columns selected <b>from</b> the passed entity. See
     * {@link View#fromAliased(Object, Comparable...)}
     * 
     * @param overrides Lets "override" returned values. E.g. if view has 3 columns and 1 value is provided, the first 2
     *                  will be taken from the entity and the last will be the "override".
     */
    @Function(name = "")
    @ViewDeclaration.From
    Record<T> from(T source,
                   Comparable<?>... overrides);

    /**
     * Same as {@link #from(Object, Comparable...)}, for multiple objects
     */
    default Record<T>[] from(Iterable<T> source) {
        return Directives.from(source).apply(this);
    }

    /**
     * Same as {@link #from(Object, Comparable...)}, with all columns aliased.
     */
    @Function(name = "", omitParentheses = true)
    @ViewDeclaration.From(aliased = true)
    Record<T> fromAliased(T source,
                          Comparable<?>... overrides);

    /**
     * Generates column names (declaration, e.g. for INSERT)
     */
    @Function(name = "")
    @ViewDeclaration.Columns
    ColumnsClause<T> columnNames();

    /**
     * Generates aliased record (e.g. for SELECT)
     */
    @Function(name = "", omitParentheses = true)
    @ViewDeclaration.Alias
    T alias(Comparable<?>... values);
}
