package co.streamx.fluent.SQL.PostgreSQL;

import co.streamx.fluent.SQL.Keyword;

public enum DatePart implements Keyword {
    EPOCH, CENTURY, DECADE, MILLENNIUM, YEAR, ISOYEAR, QUARTER, MONTH, WEEK, DAY, DOW, DOY, ISODOW, HOUR, MINUTE,
    SECOND, MILLISECONDS, MICROSECONDS, TIMEZONE, TIMEZONE_HOUR, TIMEZONE_MINUTE,
}
