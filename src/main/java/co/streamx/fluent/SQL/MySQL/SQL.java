package co.streamx.fluent.SQL.MySQL;

import java.sql.Timestamp;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.EnumSet;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Consumer;

import co.streamx.fluent.JPA.spi.SQLConfigurator;
import co.streamx.fluent.SQL.Clause;
import co.streamx.fluent.functions.Consumer0;
import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Literal;
import co.streamx.fluent.notation.Local;
import co.streamx.fluent.notation.Operator;

public interface SQL {

    // Clauses

    @Function(omitParentheses = true)
    static Clause ON_DUPLICATE_KEY_UPDATE(Consumer0 updates) {
        throw new UnsupportedOperationException();
    }

    // String

    @Function
    static String BIN(Number number) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String CHAR(int... charCodes) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int FIND_IN_SET(String expression,
                           String list) {
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

    @Function(underscoresAsBlanks = false)
    static String FROM_BASE64(String encoded) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR(String string,
                     String substring) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LENGTH(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LOCATE(String expressionToFind,
                       String expressionToSearch) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LOCATE(String expressionToFind,
                       String expressionToSearch,
                       Number startLocation) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String LPAD(String expression,
                       int length,
                       String padWith) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String MAKE_SET(int bits,
                           String... strings) {
        throw new UnsupportedOperationException();
    }

    @Function
    static MatchAgainst MATCH(CharSequence... charSequences) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String QUOTE(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String REPEAT(String expression,
                         Number count) {
        throw new UnsupportedOperationException();
    }

    @Function
    @Operator(omitParentheses = true)
    static boolean REGEXP(String stringToMatch,
                          String pattern) {
        throw new UnsupportedOperationException();
    };

    @Function
    @Operator(omitParentheses = true)
    static boolean RLIKE(String stringToMatch,
                         String pattern) {
        throw new UnsupportedOperationException();
    };

    @Function(underscoresAsBlanks = false)
    static String REGEXP_INSTR(String expression,
                               String pattern) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_INSTR(String expression,
                               String pattern,
                               int position) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_INSTR(String expression,
                               String pattern,
                               int position,
                               int occurence) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_INSTR(String expression,
                               String pattern,
                               int position,
                               int occurence,
                               int returnOption) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_INSTR(String expression,
                               String pattern,
                               int position,
                               int occurence,
                               int returnOption,
                               String matchParam) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_LIKE(String expression,
                              String pattern) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_LIKE(String expression,
                              String pattern,
                              String matchParam) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_REPLACE(String expression,
                                 String pattern,
                                 String replaceExpression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_REPLACE(String expression,
                                 String pattern,
                                 String replaceExpression,
                                 int position) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_REPLACE(String expression,
                                 String pattern,
                                 String replaceExpression,
                                 int position,
                                 int occurence) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_REPLACE(String expression,
                                 String pattern,
                                 String replaceExpression,
                                 int position,
                                 int occurence,
                                 String matchParam) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_SUBSTR(String expression,
                                String pattern) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_SUBSTR(String expression,
                                String pattern,
                                int position) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_SUBSTR(String expression,
                                String pattern,
                                int position,
                                int occurence) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_SUBSTR(String expression,
                                String pattern,
                                int position,
                                int occurence,
                                String matchParam) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String RPAD(String expression,
                       int length,
                       String padWith) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SOUNDEX(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SPACE(Number count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTRING(String expression,
                            int from,
                            int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTRING(String expression,
                            int from) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String SUBSTRING_INDEX(String expression,
                                  String delimiter,
                                  int count) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_BASE64(String expression) {
        throw new UnsupportedOperationException();
    }

    // control flow
    @Function
    static <T> T IF(boolean condition,
                    T ifTrue,
                    T otherwise) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T IFNULL(T ifNotNull,
                        T otherwise) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Clause LIMIT(int rowCount) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Clause LIMIT(int offset,
                        int rowCount) {
        throw new UnsupportedOperationException();
    }

    // informational
    @Function(underscoresAsBlanks = false)
    static <T extends Number> T LAST_INSERT_ID(T next) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long LAST_INSERT_ID() {
        throw new UnsupportedOperationException();
    }

    // Date and Time
    @Function
    static <T extends Date> T ADDDATE(T date,
                                      Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T ADDDATE(T date,
                                          Timestamp interval) {
        throw new UnsupportedOperationException();
    }


    @Function
    static <T extends Date> T ADDDATE(T date,
                                      int days) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T ADDDATE(T date,
                                          int days) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T ADDTIME(T date,
                                      Comparable<?> time) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T ADDTIME(T date,
                                          Comparable<?> time) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T CONVERT_TZ(T date,
                                         String from_tz,
                                         String to_tz) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Temporal> T CONVERT_TZ(T date,
                                             String from_tz,
                                             String to_tz) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int CURDATE() {
        throw new UnsupportedOperationException();
    }

    @Function
    static int CURTIME() {
        throw new UnsupportedOperationException();
    }

    @Function
    static float CURTIME(int fsp) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T DATE(T date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T DATE(T date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEDIFF(Date from,
                        Date to) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DATEDIFF(Temporal from,
                        Temporal to) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T DATE_ADD(T date,
                                       Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Temporal> T DATE_ADD(T date,
                                           Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String DATE_ADD(String date,
                           Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String DATE_FORMAT(Date date,
                              String format) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String DATE_FORMAT(Temporal date,
                              String format) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String DAYNAME(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAYOFMONTH(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAYOFMONTH(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAYOFWEEK(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAYOFWEEK(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAYOFYEAR(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int DAYOFYEAR(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function(argumentsDelimiter = " FROM")
    static int EXTRACT(TimeUnit unit,
                       Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(argumentsDelimiter = " FROM")
    static int EXTRACT(TimeUnit unit,
                       Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String GET_FORMAT(DataTypeNames dateTypeName,
                             @Literal DateFormatType formatType) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int HOUR(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int HOUR(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int HOUR(String date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T LAST_DAY(T date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Temporal> T LAST_DAY(T date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T MAKEDATE(int year,
                          int dayofyear) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T MAKETIME(int hour,
                          int minute,
                          int second) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int MICROSECOND(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int MICROSECOND(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int MINUTE(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int MINUTE(Temporal date) {
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
    static String MONTHNAME(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String MONTHNAME(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T NOW() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T NOW(int fsp) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int PERIOD_ADD(int period,
                          int nMonths) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int PERIOD_DIFF(int period1,
                           int period2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int QUARTER(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int QUARTER(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int SECOND(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int SECOND(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T SEC_TO_TIME(int seconds) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T STR_TO_DATE(String date,
                             String format) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T SUBDATE(T date,
                                      Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T SUBDATE(T date,
                                          Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T SUBDATE(T date,
                                      int days) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T SUBDATE(T date,
                                          int days) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T SUBTIME(T expr1,
                                      T expr2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T SUBTIME(T expr1,
                                          T expr2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T SYSDATE() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T SYSDATE(int fsp) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T TIME(T date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T TIME(T date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T TIMEDIFF(T expr1,
                                       T expr2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Temporal> T TIMEDIFF(T expr1,
                                           T expr2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long TO_DAYS(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long TO_DAYS(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long TO_SECONDS(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long TO_SECONDS(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long UNIX_TIMESTAMP() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double UNIX_TIMESTAMP(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double UNIX_TIMESTAMP(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T UTC_DATE() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T UTC_TIME() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T UTC_TIME(int fsp) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T UTC_TIMESTAMP() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T UTC_TIMESTAMP(int fsp) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEK(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEK(Temporal date,
                    int mode) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEK(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEK(Date date,
                    int mode) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEKDAY(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEKDAY(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEKOFYEAR(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int WEEKOFYEAR(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEAR(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEAR(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEARWEEK(Temporal date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEARWEEK(Temporal date,
                        int mode) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEARWEEK(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int YEARWEEK(Date date,
                        int mode) {
        throw new UnsupportedOperationException();
    }

    // Encryption
    @Function
    static String MD5(String expr) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SHA1(String expr) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SHA2(String expr,
                       int hashLength) {
        throw new UnsupportedOperationException();
    }

    // Locking
    @Function(underscoresAsBlanks = false)
    static String GET_LOCK(String name,
                           int timeout) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static boolean IS_FREE_LOCK(String name) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String IS_USED_LOCK(String name) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int RELEASE_ALL_LOCKS() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static boolean RELEASE_LOCK(String name) {
        throw new UnsupportedOperationException();
    }

    // Aggregate

    @Function(underscoresAsBlanks = false)
    static <T extends Comparable<? super T>> T BIT_AND(T expr) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Comparable<? super T>> T BIT_OR(T expr) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Comparable<? super T>> T BIT_XOR(T expr) {
        throw new UnsupportedOperationException();
    }

    /**
     * Use {@link co.streamx.fluent.SQL.SQL#ALL(Comparable...) ALL} or
     * {@link co.streamx.fluent.SQL.SQL#DISTINCT(Comparable...) DISTINCT} to pass multiple expressions
     */
    @Function(underscoresAsBlanks = false)
    static String GROUP_CONCAT(Comparable<?> expr) {
        throw new UnsupportedOperationException();
    }

    /**
     * Use {@link co.streamx.fluent.SQL.SQL#ALL(Comparable...) ALL} or
     * {@link co.streamx.fluent.SQL.SQL#DISTINCT(Comparable...) DISTINCT} to pass multiple expressions
     */
    @Function(underscoresAsBlanks = false, argumentsDelimiter = " SEPARATOR")
    static String GROUP_CONCAT(Comparable<?> expr,
                               String separator) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String JSON_ARRAYAGG(Comparable<?> expr) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String JSON_OBJECTAGG(Comparable<?> key,
                                 Comparable<?> value) {
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

        SQLConfig.registerMethodSubstitution(String::length, SQL::LENGTH);
    }
}
