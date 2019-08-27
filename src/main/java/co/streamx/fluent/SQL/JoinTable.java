package co.streamx.fluent.SQL;

import java.util.Collection;

import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.notation.TableCollection;
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
     * Generates the association between the Join Table and the entity declaring the collection, regardless if it's an
     * owning entity or not. i.e. in case of <br>
     * <br>
     * {@code join(customer, Customer::getPhones}, <br>
     * <br>
     * the association will be between the Join Table and Customer entity. And the generated SQL may look like:<br>
     * <br>
     * {@code JOIN_TABLE.CUSTOMER_ID = CUSTOMER.ID}
     *
     * @param entity entity to join
     * @param on     property on entity which maps the ManyToMany relationship
     */
    @TableJoin
    @TableCollection
    <T, R extends Collection<?>> boolean join(T entity,
                                              Function1<T, R> on);


    /**
     * Use this method <strong>only</strong> in case the inverse side entity does not declare the collection. Assuming a
     * many to many relationships between {@code Customer} and {@code Phone} entities. {@code Customer.getPhones()} owns
     * the association, but there is no {@code Phone.getCustomers()} method. In this case the association between Join
     * Table and {@code Phone} entity can be specified with this method:<br>
     * <br>
     * {@code inverseJoin(phone, Customer::getPhones)}
     * 
     * @param entity entity to join
     * @param on     property on the owner entity which maps the ManyToMany relationship
     */
    @TableJoin(inverse = true)
    <T extends Collection<INVERSE_JOINED>> boolean inverseJoin(INVERSE_JOINED entity,
                                                               Function1<JOINED, T> on);

    /**
     * Each row in Join Table has a foreign key (i.e. reference) to a joined and inverse joined entities. This property
     * returns a {@code JOINED} entity.
     * 
     * @return {@code JOINED} entity
     */
    @TableJoin.Property
    JOINED getJoined();

    /**
     * Each row in Join Table has a foreign key (i.e. reference) to a joined and inverse joined entities. This property
     * returns a {@code INVERSE_JOINED} entity.
     * 
     * @return {@code INVERSE_JOINED} entity
     */
    @TableJoin.Property
    INVERSE_JOINED getInverseJoined();
}
