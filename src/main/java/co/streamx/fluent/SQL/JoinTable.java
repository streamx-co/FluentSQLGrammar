package co.streamx.fluent.SQL;

import java.util.Collection;

import co.streamx.fluent.notation.TableJoin;
import co.streamx.fluent.notation.Tuple;

/**
 * Pseudo entity simulating JoinTable in ManyToMany relationship.
 *
 * @param <JOINED>         Joined Entity
 * @param <INVERSE_JOINED> Inverse Joined Entity (the other side)
 */
@Tuple
public interface JoinTable<JOINED, INVERSE_JOINED> {

    /**
     * Generates the association between the Join Table and the entity declaring the collection, i.e. in case of <br>
     * <br>
     * {@code joinBy(customer.getPhones()}, <br>
     * <br>
     * the association will be between the Join Table and Customer entity. And the generated SQL may look like:<br>
     * <br>
     * {@code JOIN_TABLE.CUSTOMER_ID = CUSTOMER.ID}
     *
     * @param collection specifying the mapping
     */
    @TableJoin
    <T extends Collection<?>> boolean joinBy(T collection);

    /**
     * Use this method <strong>only</strong> in case the inverse side entity does not declare the collection. Assuming a
     * many to many relationships between {@code Customer} and {@code Phone} entities. {@code Customer.getPhones()} owns
     * the association, but there is no {@code Phone.getCustomer()} method. In this case the association between Join
     * Table and {@code Phone} entity can be specified with this method:<br>
     * <br>
     * {@code inverseJoinBy(customer.getPhones(), phone)}
     * 
     * @param inversedCollection inverse side entities collection
     * @param inverseJoined      inverse side entity
     */
    @TableJoin(inverse = true)
    <T extends Collection<INVERSE_JOINED>> boolean inverseJoinBy(T inversedCollection,
                                                                 INVERSE_JOINED inverseJoined);

    /**
     * Each row in Join Table has a foreign key (i.e. reference) to a joined and inverse joined entities. This property
     * returns a {@code JOINED} entity.
     * 
     * @return {@code JOINED} entity
     */
    @TableJoin(property = true)
    JOINED getJoined();

    /**
     * Each row in Join Table has a foreign key (i.e. reference) to a joined and inverse joined entities. This property
     * returns a {@code INVERSE_JOINED} entity.
     * 
     * @return {@code INVERSE_JOINED} entity
     */
    @TableJoin(property = true, inverse = true)
    INVERSE_JOINED getInverseJoined();
}
