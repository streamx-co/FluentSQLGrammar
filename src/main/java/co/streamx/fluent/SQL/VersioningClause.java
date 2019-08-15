package co.streamx.fluent.SQL;

import java.time.temporal.Temporal;
import java.util.Date;

import co.streamx.fluent.notation.Function;

public interface VersioningClause {

    @Function(omitParentheses = true)
    void AS_OF(Date date);

    @Function(omitParentheses = true)
    void AS_OF(Temporal date);

    @Function(name = "FROM", omitParentheses = true, argumentsDelimiter = " TO")
    void FROM_TO(Date start,
                 Date end);

    @Function(name = "FROM", omitParentheses = true, argumentsDelimiter = " TO")
    void FROM_TO(Temporal start,
                 Temporal end);

    @Function(omitParentheses = true, argumentsDelimiter = " AND")
    void BETWEEN(Date start,
                 Date end);

    @Function(omitParentheses = true, argumentsDelimiter = " AND")
    void BETWEEN(Temporal start,
                 Temporal end);

    @Function
    void CONTAINED_IN(Date start,
                      Date end);

    @Function
    void CONTAINED_IN(Temporal start,
                      Temporal end);

    @Function(omitParentheses = true)
    void ALL();
}
