package co.streamx.fluent.SQL.Oracle;

import java.util.Arrays;
import java.util.stream.Collectors;

import co.streamx.fluent.notation.Literal;
import co.streamx.fluent.notation.Local;
import lombok.RequiredArgsConstructor;

@Literal
public enum Format implements FormatModel {

    /**
     * One greater than the first two digits of a four-digit year
     */
    CC, SCC,

    /**
     * Year (rounds up on July 1)
     */
    SYYYY, YYYY, YEAR, SYEAR, YYY, YY, Y,
    /**
     * ISO Year
     */
    IYYY, IY, I,
    /**
     * Quarter (rounds up on the sixteenth day of the second month of the quarter)
     */
    Q,
    /**
     * Month (rounds up on the sixteenth day)
     */
    MON, MONTH, MM, RM,
    /**
     * Same day of the week as the first day of the year
     */
    WW,
    /**
     * Same day of the week as the first day of the ISO year
     */
    IW,
    /**
     * Same day of the week as the first day of the month
     */
    W,
    /**
     * Day
     */
    DD, DDD, J,
    /**
     * Starting day of the week
     */
    DAY, DY, D,
    /**
     * Hour
     */
    HH, HH12, HH24,
    /**
     * Minute
     */
    MI,

    ;

    /**
     * Creates {@link FormatModel} with formats joined by '-'.
     * 
     * <pre>
     * {@code
     * // DD-MON-YY
     * DateFormat.model(DateFormat.DD, DateFormat.MON, DateFormat.YY);
     * }
     * </pre>
     */
    @Local
    public static FormatModel dateModel(Format... elements) {
        String join = Arrays.stream(elements).map(Format::toString).collect(Collectors.joining("-"));
        return createModel(join);
    }

    /**
     * Creates {@link FormatModel} with formats joined by ':'.
     * 
     * @see #dateModel(Format...)
     */
    @Local
    public static FormatModel timeModel(Format... elements) {
        String join = Arrays.stream(elements).map(Format::toString).collect(Collectors.joining(":"));
        return createModel(join);
    }

    /**
     * Creates generic {@link FormatModel}
     * 
     * @param formatModel See {@link <a href=
     *                    "https://docs.oracle.com/cd/B28359_01/server.111/b28286/sql_elements004.htm#SQLRF00210">Format
     *                    Models</a>}
     */
    @Local
    public static FormatModel model(String formatModel) {
        return createModel(formatModel);
    }

    @Literal
    @RequiredArgsConstructor
    private static class FormatModelImpl implements FormatModel {
        private final String formatModel;

        @Override
        public String toString() {
            return formatModel;
        }
    }

    private static FormatModel createModel(String formatModel) {
        return new FormatModelImpl(formatModel);
    }
}
