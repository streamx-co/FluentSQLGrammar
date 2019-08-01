package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface DeleteClause extends Clause {
    @Function(omitParentheses = true)
    DeleteUsing FROM(Object tableReference);
}
