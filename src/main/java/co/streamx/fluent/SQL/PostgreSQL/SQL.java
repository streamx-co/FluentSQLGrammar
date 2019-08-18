package co.streamx.fluent.SQL.PostgreSQL;

import java.sql.Timestamp;
import java.util.Date;
import java.util.EnumSet;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Consumer;

import co.streamx.fluent.JPA.spi.SQLConfigurator;
import co.streamx.fluent.SQL.Record2;
import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Literal;
import co.streamx.fluent.notation.Local;
import co.streamx.fluent.notation.Operator;
import co.streamx.fluent.notation.ParameterContext;

public interface SQL {

    // String

    @Function
    static String CHR(int charCode) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LENGTH(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String MD5(CharSequence expression) {
        throw new UnsupportedOperationException();
    }

    @Function(argumentsDelimiter = " IN")
    static int POSITION(String expressionToFind,
                        String expressionToSearch) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String REPEAT(String expression,
                         Number count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int STRPOS(String expressionToFind,
                       String expressionToSearch) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int STARTS_WITH(String expression,
                           String prefix) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTR(String expression,
                         int from,
                         int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTR(String expression,
                         int from) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(Object expression,
                          String format) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T TO_DATE(String expression,
                                      String format) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Number> String TO_HEX(T integralExpression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Number> T TO_NUMBER(String expression,
                                          String format) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static Timestamp TO_TIMESTAMP(String expression,
                                  String format) {
        throw new UnsupportedOperationException();
    }

    /**
     * Special EXCLUDED table is used to reference values originally proposed for insertion.
     * 
     * @see <a href="https://www.postgresql.org/docs/current/sql-insert.html">SQL INSERT</a>
     * 
     *      <blockquote>To use, cast it to the table being updated, e.g.
     * 
     *      <pre>
     * {@code
     *     Distributor excluded = EXCLUDED();
     *     // and later access it's properties as usual:
     *     excluded.getDname()
     * }
     * </pre>
     * 
     * </blockquote>
     */
    @Function(omitParentheses = true)
    static <T> T EXCLUDED() {
        throw new UnsupportedOperationException();
    }

    @SafeVarargs
    @Function
    static <T> T GREATEST(T... expressions) {
        throw new UnsupportedOperationException();
    }

    @SafeVarargs
    @Function
    static <T> T LEAST(T... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true, parameterContext = ParameterContext.SELECT)
    static void RETURNING(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false, requiresAlias = true)
    static <T extends Number, R> R GENERATE_SERIES(T start,
                                                   T stop) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false, requiresAlias = true)
    static <T extends Number, R> R GENERATE_SERIES(T start,
                                                   T stop,
                                                   T step) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static void LIMIT(long rowCount) {
        throw new UnsupportedOperationException();
    }

    // Math

    @Function
    static <T extends Number> T DIV(T x,
                                      T y) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T LN(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T MOD(T x,
                                    T y) {
        throw new UnsupportedOperationException();
    }

    @Function
    static double RANDOM() {
        throw new UnsupportedOperationException();
    }

    // Date / Time

    /**
     * 1970-01-01 00:00:00+00 (Unix system time zero)
     */
    @Function(omitParentheses = true)
    static Date EPOCH() {
        throw new UnsupportedOperationException();
    }

    /**
     * later than all other time stamps
     */
    @Function(omitParentheses = true)
    static Date INFINITY() {
        throw new UnsupportedOperationException();
    }

    /**
     * earlier than all other time stamps
     */
    @Function(name = "-INFINITY", omitParentheses = true)
    static Date negativeINFINITY() {
        throw new UnsupportedOperationException();
    }

    /**
     * current transaction's start time
     */
    @Function
    static <T> T NOW() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false, omitParentheses = true)
    static <T extends Date> T CURRENT_TIME() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static <T extends Date> T LOCALTIME() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Timestamp LOCALTIMESTAMP() {
        throw new UnsupportedOperationException();
    }

    @Function(argumentsDelimiter = " FROM")
    static int EXTRACT(DatePart datePart,
                       Date datetime) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int DATE_TRUNC(@Literal DatePart datePart,
                          Date datetime) {
        throw new UnsupportedOperationException();
    }

    @Operator
    @Function(omitParentheses = true)
    static <T1 extends Record2<? extends Date, ? extends Date>, T2 extends Record2<? extends Date, ? extends Date>> boolean OVERLAPS(T1 range1,
                                                                                                                                     T2 tange2) {
        throw new UnsupportedOperationException();
    }

    @Operator
    @Function(omitParentheses = true)
    static <T> boolean IS_DISTINCT_FROM(T expr1,
                                        T expr2) {
        throw new UnsupportedOperationException();
    }

    // Aggregate / statistics

    @Function
    static double CORR(Object x,
                       Object y) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double COVAR_POP(double y,
                            double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double COVAR_SAMP(double y,
                             double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SLOPE(double y,
                             double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_INTERCEPT(double y,
                                 double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long REGR_COUNT(double y,
                           double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_R2(double y,
                          double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_AVGX(double y,
                            double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_AVGY(double y,
                            double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SXX(double y,
                           double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SYY(double y,
                           double x) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SXY(double y,
                           double x) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Comparable<? super T>> T MODE() {
        throw new UnsupportedOperationException();
    }

    /**
     * Usage example:<br>
     * <br>
     * {@code registerVendorCapabilities(FluentJPA::setCapabilities);}
     */
    @Local
    static void registerVendorCapabilities(Consumer<Set<Capability>> registrar) {
        registrar.accept(
                EnumSet.of(Capability.ALIAS_INSERT, Capability.ALIAS_UPDATE, Capability.ALIAS_DELETE,
                        Capability.TABLE_AS_ALIAS));

        ServiceLoader<SQLConfigurator> loader = ServiceLoader.load(SQLConfigurator.class);
        SQLConfigurator SQLConfig = loader.iterator().next();

        SQLConfig.registerMethodSubstitution(String::length, SQL::LENGTH);
    }
}
