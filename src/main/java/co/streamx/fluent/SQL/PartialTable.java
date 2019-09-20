package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.TableExtension;
import co.streamx.fluent.notation.TableExtensionType;
import co.streamx.fluent.notation.Tuple;

/**
 * Pseudo entity simulating joined table in cases like SecondaryTable, InheritanceType.JOIN.
 *
 * @param <BASE> Primary Entity
 */
@Tuple
public interface PartialTable<BASE> {
    /**
     * Joins this {@link PartialTable} with its {@link BASE} entity connected by {@code @SecondaryTable} annotation.<br>
     * <br>
     * Returns the condition to be used in {@literal JOIN}.
     */
    @TableExtension(TableExtensionType.SECONDARY)
    boolean secondary(BASE entity);

    /**
     * Joins this {@link PartialTable} with its {@link BASE} entity connected by {@code @SecondaryTable} annotation.<br>
     * <br>
     * Returns the condition to be used in {@literal JOIN}.
     */
    @TableExtension(TableExtensionType.SECONDARY)
    boolean secondary(BASE entity,
                      String secondaryTableName);

    /**
     * Joins this {@link PartialTable} with its {@link BASE} entity connected by
     * {@code @Inheritance(strategy = InheritanceType.JOINED)} annotation.<br>
     * <br>
     * Returns the condition to be used in {@literal JOIN}.
     */
    @TableExtension(TableExtensionType.INHERITANCE)
    boolean joined(BASE entity);
}
