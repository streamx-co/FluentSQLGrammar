package co.streamx.fluent.SQL.MySQL;

import co.streamx.fluent.notation.Function;

public interface MatchAgainst {

    @Function
    boolean AGAINST(CharSequence toSearch);

    @Function
    boolean AGAINST(CharSequence toSearch,
                    SearchMode searchMode);
}
