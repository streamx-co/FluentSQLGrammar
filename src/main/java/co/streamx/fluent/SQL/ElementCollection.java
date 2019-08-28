package co.streamx.fluent.SQL;

import java.util.Collection;

import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.notation.TableCollection;
import co.streamx.fluent.notation.Tuple;

@Tuple
public interface ElementCollection<OWNER, ELEMENT> {

    /**
     * Generates the association between the Collection Table and the entity declaring the collection. i.e. in case of
     * <br>
     * <br>
     * {@code join(user, User::getPhones)}, <br>
     * <br>
     * the association will be between the Element Table and User entity. And the generated SQL may look like:<br>
     * <br>
     * {@code PHONES.USER_ID = USERS.ID}
     *
     * @param owner collection owner entity
     * @param on    property on entity which maps the element collection
     */
    @TableCollection
    <T extends Collection<ELEMENT>> boolean join(OWNER owner,
                                                 Function1<OWNER, T> on);

    /**
     * Each row in Element Table has a foreign key (i.e. reference) to its owner and an embedded ELEMENT. This property
     * returns a {@code OWNER} entity.
     * 
     * @return {@code OWNER} entity
     */
    @TableCollection.Property(owner = true)
    OWNER getOwner();

    /**
     * Each row in Element Table has a foreign key (i.e. reference) to its owner and an embedded ELEMENT. This property
     * returns a {@code ELEMENT} entity.
     * 
     * @return {@code ELEMENT} entity
     */
    @TableCollection.Property
    ELEMENT getElement();
}
