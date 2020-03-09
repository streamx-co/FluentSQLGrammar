package co.streamx.fluent.SQL;

import java.util.Date;

import co.streamx.fluent.notation.Function;

public interface ScalarFunctions {

    // String

    @Function
    static int ASCII(String characterExpression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String CONCAT(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String CONCAT_WS(String separator,
                            Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String LOWER(String characterExpression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String UPPER(String characterExpression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String LTRIM(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String RTRIM(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String LEFT(String expression,
                       Number length) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String RIGHT(String expression,
                        Number length) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String TRIM(String expression) {
        throw new UnsupportedOperationException();
    }

    /**
     * Use with {@link #TRIM(Trim)}
     */
    @Function(omitParentheses = true)
    static Trim BOTH(String expression) {
        throw new UnsupportedOperationException();
    }

    /**
     * Use with {@link #TRIM(Trim)}
     */
    @Function(omitParentheses = true)
    static Trim LEADING() {
        throw new UnsupportedOperationException();
    }

    /**
     * Use with {@link #TRIM(Trim)}
     */
    @Function(omitParentheses = true)
    static Trim LEADING(String expression) {
        throw new UnsupportedOperationException();
    }

    /**
     * Use with {@link #TRIM(Trim)}
     */
    @Function(omitParentheses = true)
    static Trim TRAILING() {
        throw new UnsupportedOperationException();
    }

    /**
     * Use with {@link #TRIM(Trim)}
     */
    @Function(omitParentheses = true)
    static Trim TRAILING(String expression) {
        throw new UnsupportedOperationException();
    }

    /**
     * See {@link #BOTH(String)}, {@link #LEADING(String)}, {@link #TRAILING(String)} <br>
     * <br>
     * Example: {@code TRIM(TRAILING("xyz").FROM("barxxyz"))}
     */
    @Function
    static String TRIM(Trim trim) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String REVERSE(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String TRANSLATE(String expression,
                            String characters,
                            String translations) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String REPLACE(String expression,
                          CharSequence pattern,
                          CharSequence replacement) {
        throw new UnsupportedOperationException();
    }

    // Mathematical

    @Function
    static <T extends Number> T ABS(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T ACOS(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T ASIN(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T ATAN(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T CEILING(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T COS(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T COT(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T DEGREES(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T EXP(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T FLOOR(T numeric) {
        throw new UnsupportedOperationException();
    }

    /**
     * Implementation varies between vendors. Some calculate natural, while others base-10 logarithm.
     */
    @Function
    static <T extends Number> T LOG(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T LOG(T numeric,
                                    int base) {
        throw new UnsupportedOperationException();
    }

    @Function
    static double PI() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T POWER(T numeric,
                                      Number power) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T RADIANS(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T ROUND(T numeric,
                                      int length) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T SIGN(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T SIN(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T SQRT(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T TAN(T numeric) {
        throw new UnsupportedOperationException();
    }

    // Conditional

    @Function(omitParentheses = true)
    static <T> CaseEnd<T> CASE(When<T> caseExpression) {
        throw new UnsupportedOperationException();
    }

    @Function(argumentsDelimiter = " THEN", omitParentheses = true)
    static <T> CaseWhen<T> WHEN(boolean condition,
                                T result) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static CaseThenFirst WHEN(boolean condition) {
        throw new UnsupportedOperationException();
    }

    @SafeVarargs
    @Function
    static <T extends Comparable<? super T>> T COALESCE(T... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Comparable<? super T>> T NULLIF(T expression1,
                                              T expression2) {
        throw new UnsupportedOperationException();
    }

    // Date / Time

    /**
     * Not supported in SQL Server. See <a href=
     * "https://docs.microsoft.com/en-us/sql/t-sql/functions/date-and-time-data-types-and-functions-transact-sql">docs</a>
     */
    @Function(underscoresAsBlanks = false, omitParentheses = true)
    static <T extends Date> T CURRENT_DATE() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false, omitParentheses = true)
    static <T extends Date> T CURRENT_TIMESTAMP() {
        throw new UnsupportedOperationException();
    }

    // Conversion

    /**
     * Creates a CAST expression, e.g. {@code CAST(<expression> AS DATE)}
     */
    @Function(argumentsDelimiter = " AS")
    static <T extends Comparable<? super T>, TypeName extends DataType<T>, E extends Comparable<E>> T CAST(E expression,
                                                                                                           TypeName dataType) {
        throw new UnsupportedOperationException();
    }
}
