package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.notation.Keyword;

public enum Interval implements Keyword {
    DAY_TO_SECOND,

    DAY_TO_MINUTE,

    DAY_TO_HOUR,

    HOUR_TO_SECOND,

    HOUR_TO_MINUTE,

    MINUTE_TO_SECOND,

    DAY, HOUR, MUNUTE, SECOND,

    YEAR_TO_MONTH,

    YEAR, MONTH,

    ;

    private final String replaced;

    private Interval() {
        replaced = super.toString().replace('_', ' ');
    }

    @Override
    public String toString() {
        return replaced;
    }
}
