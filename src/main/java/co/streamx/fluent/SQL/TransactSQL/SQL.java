package co.streamx.fluent.SQL.TransactSQL;

import java.time.temporal.Temporal;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Consumer;

import co.streamx.fluent.JPA.spi.SQLConfigurator;
import co.streamx.fluent.SQL.Clause;
import co.streamx.fluent.SQL.ColumnsClause;
import co.streamx.fluent.SQL.MatchThen;
import co.streamx.fluent.SQL.MergeClause;
import co.streamx.fluent.SQL.UpdateSet;
import co.streamx.fluent.SQL.WindowOver;
import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Literal;
import co.streamx.fluent.notation.Local;
import co.streamx.fluent.notation.ParameterContext;

public interface SQL {

    // String

    @Function
    static String CHAR(int charCode) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String NCHAR(int charCode) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int CHARINDEX(String expressionToFind,
                         String expressionToSearch) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int CHARINDEX(String expressionToFind,
                         String expressionToSearch,
                         int startLocation) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int PATINDEX(String patternToFind,
                        String expressionToSearch) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DIFFERENCE(String expression1,
                          String expression2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String FORMAT(String expression,
                         String format) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String FORMAT(String expression,
                         String format,
                         String culture) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LEN(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String REPLICATE(String expression,
                            int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SOUNDEX(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SPACE(int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String STR(String numericExpression,
                      int length,
                      int decimals) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String STRING_ESCAPE(String expression,
                                String type) {
        throw new UnsupportedOperationException();
    }

    @Function
    static Collection<String> STRING_SPLIT(String expression,
                                           String separator) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String STUFF(String expression,
                        int start,
                        int length,
                        String replaceWithExpression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTRING(String expression,
                            int start,
                            int length) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int UNICODE(String ncharacterExpression) {
        throw new UnsupportedOperationException();
    }

    // Date/Time

    @Function(name = "@@DATEFIRST", omitParentheses = true)
    static int DATEFIRST() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false, omitParentheses = true)
    static String CURRENT_TIMEZONE() {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEAR(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEAR(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEAR(String date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int MONTH(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int MONTH(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int MONTH(String date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAY(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAY(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAY(String date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T DATEADD(DatePart datepart,
                                      Number delta,
                                      T date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T DATEADD(DatePart datepart,
                                          Number delta,
                                          T date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T DATEADD(DatePart datepart,
                                      Number delta,
                                      String date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEDIFF(DatePart datepart,
                        Date from,
                        Date to) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEDIFF(DatePart datepart,
                        Temporal from,
                        Temporal to) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEDIFF(DatePart datepart,
                        String from,
                        String to) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long DATEDIFF_BIG(DatePart datepart,
                             Date from,
                             Date to) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long DATEDIFF_BIG(DatePart datepart,
                             Temporal from,
                             Temporal to) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long DATEDIFF_BIG(DatePart datepart,
                             String from,
                             String to) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T DATEFROMPARTS(int year,
                                            int month,
                                            int day) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T DATETIME2FROMPARTS(int year,
                                                 int month,
                                                 int day,
                                                 int hour,
                                                 int minute,
                                                 int seconds,
                                                 int fractions,
                                                 int precision) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T DATETIMEFROMPARTS(int year,
                                                int month,
                                                int day,
                                                int hour,
                                                int minute,
                                                int seconds,
                                                int milliseconds) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T DATETIMEOFFSETFROMPARTS(int year,
                                                      int month,
                                                      int day,
                                                      int hour,
                                                      int minute,
                                                      int seconds,
                                                      int fractions,
                                                      int hour_offset,
                                                      int minute_offset,
                                                      int precision) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T SMALLDATETIMEFROMPARTS(int year,
                                                     int month,
                                                     int day,
                                                     int hour,
                                                     int minute) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T TIMEFROMPARTS(int hour,
                                            int minute,
                                            int seconds,
                                            int fractions,
                                            int precision) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String DATENAME(DatePart datepart,
                           Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String DATENAME(DatePart datepart,
                           Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String DATENAME(DatePart datepart,
                           String date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEPART(DatePart datepart,
                        Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEPART(DatePart datepart,
                        Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEPART(DatePart datepart,
                        String date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T GETDATE() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T GETUTCDATE() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T SYSDATETIME() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T SYSDATETIMEOFFSET() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T SYSUTCDATETIME() {
        throw new UnsupportedOperationException();
    }

    @Function
    static boolean ISDATE(Object expression) {
        throw new UnsupportedOperationException();
    }

    // System

    @Function
    static int CHECKSUM(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int BINARY_CHECKSUM(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String HASHBYTES(@Literal HashingAlgorithm hashingAlgorithm,
                            Object expression) {
        throw new UnsupportedOperationException();
    }

    // Logical

    @SafeVarargs
    @Function
    static <T> T CHOOSE(int index,
                        T... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T IIF(boolean condition,
                     T ifTrue,
                     T otherwise) {
        throw new UnsupportedOperationException();
    }

    // Aggregate

    @Function(underscoresAsBlanks = false)
    static int GROUPING_ID(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int CHECKSUM_AGG(Object expression) {
        throw new UnsupportedOperationException();
    }

    // Math

    @Function
    static <T extends Number> float ATN2(T y,
                                         T x) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T LOG10(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static float RAND() {
        throw new UnsupportedOperationException();
    }

    @Function
    static float RAND(int seed) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T SQUARE(T numeric) {
        throw new UnsupportedOperationException();
    }

    // General
    // OUTPUT Clause
    @Function(omitParentheses = true)
    static <T> T INSERTED() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static <T> T DELETED() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MergeAction $action() {
        throw new UnsupportedOperationException();
    }

    /**
     * OUTPUT ... INTO is not supported
     */
    @Function(omitParentheses = true, parameterContext = ParameterContext.SELECT)
    static void OUTPUT(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    // MERGE declarations (SQL:2003 + extensions)

    @Function(omitParentheses = true)
    static MergeClause MERGE() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_MATCHED() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_MATCHED_AND(boolean searchCondition) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_NOT_MATCHED() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_NOT_MATCHED_AND(boolean searchCondition) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_NOT_MATCHED_BY_SOURCE() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_NOT_MATCHED_BY_SOURCE_AND(boolean searchCondition) {
        throw new UnsupportedOperationException();
    }

    /**
     * Used in {@link SQL#MERGE()} only<br>
     * Name changed to avoid clashing
     */
    @Function(name = "UPDATE", omitParentheses = true)
    static UpdateSet<?> MERGE_UPDATE() {
        throw new UnsupportedOperationException();
    }

    /**
     * Used in {@link SQL#MERGE()} only<br>
     * Name changed to avoid clashing with {@link co.streamx.fluent.SQL.SQL#INSERT(co.streamx.fluent.notation.Keyword...)
     * INSERT}
     */
    @Function(name = "INSERT", omitParentheses = true, omitArgumentsDelimiter = true)
    static <T> Clause MERGE_INSERT(ColumnsClause<T> columns,
                                   T values) {
        throw new UnsupportedOperationException();
    }

    // Sequence

    @Local
    static <T extends Number & Comparable<? super T>> Sequence<T> sequence(String name) {
        return new Sequence<T>() {
            @Override
            public String toString() {
                return name;
            }
        };
    }

    @Function(omitParentheses = true)
    static <T extends Number & Comparable<? super T>> WindowOver<T> NEXT_VALUE_FOR(Sequence<T> sequence) {
        throw new UnsupportedOperationException();
    }

    /**
     * Usage example:<br>
     * <br>
     * {@code registerVendorCapabilities(FluentJPA::setCapabilities);}
     */
    @Local
    static void registerVendorCapabilities(Consumer<Set<Capability>> registrar) {
        registrar.accept(EnumSet.of(Capability.TABLE_AS_ALIAS));

        ServiceLoader<SQLConfigurator> loader = ServiceLoader.load(SQLConfigurator.class);
        SQLConfigurator SQLConfig = loader.iterator().next();

        SQLConfig.registerMethodSubstitution(String::length, SQL::LEN);
    }
}
