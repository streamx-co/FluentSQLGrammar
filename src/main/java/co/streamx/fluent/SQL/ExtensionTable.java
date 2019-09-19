package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.TableExtension;
import co.streamx.fluent.notation.Tuple;

/**
 * Pseudo entity simulating joined table in cases like SecondaryTable, InheritanceType.JOIN.
 *
 * @param <PRIMARY> Primary Entity
 */
@Tuple
public interface ExtensionTable<PRIMARY> {
    /**
     * Connects {@link ExtensionTable} with its Primary entity.<br>
     * Returns the condition to be used in {@literal JOIN}
     */
    @TableExtension
    boolean join(PRIMARY entity);

    /**
     * Connects {@link ExtensionTable} with its Primary entity.<br>
     * Returns the condition to be used in {@literal JOIN}
     */
    @TableExtension
    boolean join(PRIMARY entity,
                 String extensionTableName);
}
