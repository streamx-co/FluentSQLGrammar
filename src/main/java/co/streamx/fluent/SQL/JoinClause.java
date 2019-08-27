package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Context;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.ParameterContext;
import co.streamx.fluent.notation.TableCollection;

public interface JoinClause extends Clause {
    /**
     * Creates an INNER JOIN
     */
    @Function(name = "INNER JOIN", omitParentheses = true, parameterContext = ParameterContext.FROM)
    @TableCollection.Property
    <T> JoinCondition<T> JOIN(T tableReference);

    /**
     * Creates an INNER JOIN
     */
    @Function(name = "INNER JOIN", omitParentheses = true, argumentsDelimiter = " ON", parameterContext = ParameterContext.FROM)
    JoinClause JOIN(Object tableReference,
               @Context(ParameterContext.EXPRESSION) boolean condition);

    /**
     * Creates an INNER JOIN
     */
    @Function(name = "INNER JOIN", omitParentheses = true, parameterContext = ParameterContext.FROM)
    JoinClause JOIN(Object tableReference,
               Object... using);

    /**
     * Creates an LEFT JOIN
     */
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM)
    <T> JoinCondition<T> LEFT_JOIN(T tableReference);

    /**
     * Creates an RIGHT JOIN
     */
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM)
    <T> JoinCondition<T> RIGHT_JOIN(T tableReference);

    /**
     * Creates an FULL OUTER JOIN
     */
    @Function(name = "FULL OUTER JOIN", omitParentheses = true, parameterContext = ParameterContext.FROM)
    <T> JoinCondition<T> FULL_JOIN(T tableReference);

    /**
     * Creates an CROSS JOIN
     */
    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM)
    JoinClause CROSS_JOIN(Object tableReference);

    /**
     * PARTITION BY extension
     */
    @Function(name = "PARTITION BY", omitParentheses = true)
    JoinClause PARTITION(By... expressions);
}
