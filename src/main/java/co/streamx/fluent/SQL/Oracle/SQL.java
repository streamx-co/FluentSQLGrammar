package co.streamx.fluent.SQL.Oracle;

import java.sql.Timestamp;
import java.util.Date;
import java.util.EnumSet;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Consumer;

import co.streamx.fluent.JPA.spi.SQLConfigurator;
import co.streamx.fluent.SQL.Clause;
import co.streamx.fluent.SQL.ColumnsClause;
import co.streamx.fluent.SQL.DataType;
import co.streamx.fluent.SQL.MatchThen;
import co.streamx.fluent.SQL.MergeClause;
import co.streamx.fluent.SQL.Record;
import co.streamx.fluent.SQL.SortOrder;
import co.streamx.fluent.SQL.UpdateSet;
import co.streamx.fluent.SQL.WindowFrame;
import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Literal;
import co.streamx.fluent.notation.Local;
import co.streamx.fluent.notation.Operator;
import co.streamx.fluent.notation.ParameterContext;
import co.streamx.fluent.notation.Tuple;

public interface SQL {

    /**
     * Ubiquitous Oracle's DUAL table
     */
    @Tuple
    interface DUAL {
    }

    /**
     * @return {@link DUAL} table
     */
    @Function(omitParentheses = true)
    static DUAL DUAL() {
        throw new UnsupportedOperationException();
    }

    // Math

    @Function
    static <T extends Number> T ATAN2(T n1,
                                      T n2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T BITAND(T n1,
                                       T n2) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T COSH(T n) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T LN(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T MOD(T n2,
                                    T n1) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T NANVL(T n2,
                                      T n1) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T REMAINDER(T n2,
                                          T n1) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T ROUND(T numeric) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T SINH(T n) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T TANH(T n) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T TRUNC(T numeric,
                                      int length) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T WIDTH_BUCKET(T expr,
                              T min,
                              T max,
                              int numBuckets) {
        throw new UnsupportedOperationException();
    }

    // String

    @Function
    static String CHR(int charCode) {
        throw new UnsupportedOperationException();
    }

    @Function(argumentsDelimiter = " USING")
    static String CHR(int charCode,
                      String charset) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String INITCAP(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String LPAD(String expression,
                       int length) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String LPAD(String expression,
                       int length,
                       String padWith) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String NLS_INITCAP(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String NLS_INITCAP(String expression,
                              String nlsParam) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String NLS_LOWER(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String NLS_LOWER(String expression,
                            String nlsParam) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String NLSSORT(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String NLSSORT(String expression,
                          String nlsParam) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String NLS_UPPER(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String NLS_UPPER(String expression,
                            String nlsParam) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String REGEXP_REPLACE(String expression,
                                 String pattern) {
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

    @Function(underscoresAsBlanks = false)
    static String REGEXP_SUBSTR(String expression,
                                 String pattern,
                                 int position,
                                 int occurence,
                                 String matchParam,
                                 int subExpr) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String RPAD(String expression,
                       int length) {
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

    @Function
    static String SUBSTRB(String expression,
                          int from,
                          int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTRB(String expression,
                          int from) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTRC(String expression,
                          int from,
                          int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTRC(String expression,
                          int from) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTR2(String expression,
                          int from,
                          int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTR2(String expression,
                          int from) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTR4(String expression,
                          int from,
                          int count) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String SUBSTR4(String expression,
                          int from) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates a TREAT expression, e.g. {@code TREAT(<expression> AS employee_t)}
     */
    @Function(argumentsDelimiter = " AS")
    static <T extends Comparable<? super T>, TypeName extends DataType<T>> T TREAT(Object expression,
                                                     TypeName dataType) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR(String string,
                     String substring) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR(String string,
                     String substring,
                     int position) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR(String string,
                     String substring,
                     int position,
                     int occurrence) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTRB(String string,
                      String substring) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTRB(String string,
                      String substring,
                      int position) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTRB(String string,
                      String substring,
                      int position,
                      int occurrence) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTRC(String string,
                      String substring) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTRC(String string,
                      String substring,
                      int position) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTRC(String string,
                      String substring,
                      int position,
                      int occurrence) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR2(String string,
                      String substring) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR2(String string,
                      String substring,
                      int position) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR2(String string,
                      String substring,
                      int position,
                      int occurrence) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR4(String string,
                      String substring) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR4(String string,
                      String substring,
                      int position) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int INSTR4(String string,
                      String substring,
                      int position,
                      int occurrence) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LENGTH(CharSequence expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LENGTHB(CharSequence expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LENGTHC(CharSequence expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LENGTH2(CharSequence expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static long LENGTH4(CharSequence expression) {
        throw new UnsupportedOperationException();
    }

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
    static String REGEXP_INSTR(String expression,
                               String pattern,
                               int position,
                               int occurence,
                               int returnOption,
                               String matchParam,
                               int subExpr) {
        throw new UnsupportedOperationException();
    }

    // Date / Time

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T ADD_MONTHS(T date,
                                         int toAdd) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static String DBTIMEZONE() {
        throw new UnsupportedOperationException();
    }

    /**
     * Since this function returns {@code int}, it's not type-safe for TIMEZONE_REGION or TIMEZONE_ABBR extraction since
     * the return type is {@code String}. Use {@link #EXTRACT_STRING(DatePart, Date) EXTRACT_STRING} in these cases.
     */
    @Function(argumentsDelimiter = " FROM")
    static int EXTRACT(DatePart datePart,
                       Date datetime) {
        throw new UnsupportedOperationException();
    }

    /**
     * {@link #EXTRACT(DatePart, Date) EXTRACT} function returning {@code String}.
     */
    @Function(name = "EXTRACT", argumentsDelimiter = " FROM")
    static String EXTRACT_STRING(DatePart datePart,
                                 Date datetime) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static Timestamp FROM_TZ(Timestamp timestamp,
                             String timeZone) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T LAST_DAY(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Timestamp LOCALTIMESTAMP() {
        throw new UnsupportedOperationException();
    }

    @Function
    static Timestamp LOCALTIMESTAMP(int precision) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static float MONTHS_BETWEEN(Date date1,
                                Date date2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T NEW_TIME(Date date,
                                       TimeZone timeZone1,
                                       TimeZone timeZone2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T NEXT_DAY(Date date,
                                       WeekDay weekDay) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T NUMTODSINTERVAL(int n,
                                              @Literal Interval intervalUnit) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T NUMTOYMINTERVAL(int n,
                                              @Literal Interval intervalUnit) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T ROUND(Date date,
                                    FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static String SESSIONTIMEZONE() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T SYS_EXTRACT_UTC(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T SYS_EXTRACT_UTC(String date) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static <T extends Date> T SYSDATE() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Timestamp SYSTIMESTAMP() {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Date> T TRUNC(Date date,
                                    FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TZ_OFFSET(String timeZone) {
        throw new UnsupportedOperationException();
    }

    // General Comparison

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

    // Multiset / nested tables
    @Function
    static int CARDINALITY(Object tableReference) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T MULTISET(Object tableReference) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T POWERMULTISET(Object tableReference) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T POWERMULTISET_BY_CARDINALITY(Object tableReference,
                                              int cardinality) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    @Operator(omitParentheses = true)
    static <T> T MULTISET_EXCEPT(Object nestedTable1,
                                 Object nestedTable2) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    @Operator(omitParentheses = true)
    static <T> T MULTISET_INTERSECT(Object nestedTable1,
                                    Object nestedTable2) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    @Operator(omitParentheses = true)
    static <T> T MULTISET_UNION(Object nestedTable1,
                                Object nestedTable2) {
        throw new UnsupportedOperationException();
    }

    // Conversion

    @Function
    static String ASCIISTR(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int BIN_TO_NUM(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(Date date,
                          FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(Date date,
                          FormatModel fmt,
                          String nls) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(Number n) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(Number n,
                          FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_CHAR(Number n,
                          FormatModel fmt,
                          String nls) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T TO_DATE(String date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T TO_DATE(String date,
                                      FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T TO_DATE(String date,
                                      FormatModel fmt,
                                      String nls) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NCHAR(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NCHAR(Date date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NCHAR(Date date,
                           FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NCHAR(Date date,
                           FormatModel fmt,
                           String nls) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NCHAR(Number n) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NCHAR(Number n,
                           FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NCHAR(Number n,
                           FormatModel fmt,
                           String nls) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NUMBER(Object expr) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NUMBER(Object expr,
                            FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String TO_NUMBER(Object expr,
                            FormatModel fmt,
                            String nls) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static Timestamp TO_TIMESTAMP(String date) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static Timestamp TO_TIMESTAMP(String date,
                                  FormatModel fmt) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static Timestamp TO_TIMESTAMP(String date,
                                  FormatModel fmt,
                                  String nls) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String COMPOSE(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String DECOMPOSE(String expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String CONVERT(String expression,
                          String destinationCharSet) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String CONVERT(String expression,
                          String destinationCharSet,
                          String sourceCharSet) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String UNISTR(String expression) {
        throw new UnsupportedOperationException();
    }
    
    // Hierarchical
    
    @Function(underscoresAsBlanks = false)
    static String SYS_CONNECT_BY_PATH(String column,
                                      String separator) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String ORA_HASH(Object expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String ORA_HASH(Object expression,
                           long maxBucket) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String ORA_HASH(Object expression,
                           long maxBucket,
                           long seed) {
        throw new UnsupportedOperationException();
    }

    // control flow

    @Function
    static boolean LNNVL(boolean condition) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T NVL(T ifNotNull,
                     T otherwise) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T NVL2(Object checkForNull,
                      T ifNotNull,
                      T ifNull) {
        throw new UnsupportedOperationException();
    }

    // Aggregate

    @Function
    static <T> T COLLECT(Object expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static double CORR(Object expression1,
                      Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double CORR_K(Object expression1,
                        Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double CORR_K(Object expression1,
                        Object expression2,
                        Correlation correlation) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double CORR_S(Object expression1,
                        Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double CORR_S(Object expression1,
                        Object expression2,
                        Correlation correlation) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double COVAR_POP(Object expression1,
                           Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double COVAR_SAMP(Object expression1,
                            Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long DENSE_RANK(Number... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int GROUPING_ID(Comparable<?>... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int GROUP_ID() {
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

    @Function
    static String LISTAGG(Comparable<?> expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String LISTAGG(Comparable<?> expression,
                          String delimiter) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T MEDIAN(Object expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SLOPE(Object expression1,
                             Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_INTERCEPT(Object expression1,
                                 Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long REGR_COUNT(Object expression1,
                           Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_R2(Object expression1,
                          Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_AVGX(Object expression1,
                            Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_AVGY(Object expression1,
                            Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SXX(Object expression1,
                           Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SYY(Object expression1,
                           Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double REGR_SXY(Object expression1,
                           Object expression2) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false, omitArgumentsDelimiter = true)
    static <T> T FIRST_VALUE(T expression,
                             Ignore ignore) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false, omitArgumentsDelimiter = true)
    static <T> T LAST_VALUE(T expression,
                            Ignore ignore) {
        throw new UnsupportedOperationException();
    }

    // General

    @Function(name = "ORDER SIBLINGS BY", omitParentheses = true, aliasesVisible = true)
    static WindowFrame ORDER_SIBLINGS(SortOrder... sorts) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true, parameterContext = ParameterContext.SELECT)
    static void RETURNING(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    // MERGE declarations (same TSQL/Oracle)

    @Function(omitParentheses = true, parameterContext = ParameterContext.FROM)
    static MergeClause MERGE() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_MATCHED() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static MatchThen WHEN_NOT_MATCHED() {
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
     * Name changed to avoid clashing with {@link co.streamx.fluent.SQL.SQL#INSERT(co.streamx.fluent.SQL.Keyword...)
     * INSERT}
     */
    @Function(name = "INSERT", omitParentheses = true, omitArgumentsDelimiter = true)
    static <T> Clause MERGE_INSERT(ColumnsClause<T> columns,
                                   T values) {
        throw new UnsupportedOperationException();
    }

    /**
     * Used in {@link SQL#MERGE()} only<br>
     * Name changed to avoid clashing with {@link co.streamx.fluent.SQL.SQL#INSERT(co.streamx.fluent.SQL.Keyword...)
     * INSERT}
     */
    @Function(name = "INSERT", omitParentheses = true, omitArgumentsDelimiter = true)
    static <T> Clause MERGE_INSERT(Record<T> columns,
                                   T values) {
        throw new UnsupportedOperationException();
    }

    // Error Logging

    @Function(omitParentheses = true)
    static ErrorsInto LOG_ERRORS() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Clause REJECT_LIMIT(int limit) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static int UNLIMITED() {
        throw new UnsupportedOperationException();
    }

    // INSERT

    /**
     * Special INSERT, which translates to INTO clause. Used in multi-table inserts.
     */
    @Function(name = "INTO", omitParentheses = true, parameterContext = ParameterContext.FROM_WITHOUT_ALIAS)
    static Clause INSERT_INTO(Object tableReference) {
        throw new UnsupportedOperationException();
    }

    // Flashback

    @Function(omitParentheses = true)
    static Clause AS_OF(long SCN) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static Clause AS_OF(Timestamp timestamp) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true, omitArgumentsDelimiter = true)
    static Timestamp PERIOD_FOR(String valid_time_column,
                                Timestamp timestamp) {
        throw new UnsupportedOperationException();
    }

    /**
     * Usage example:<br>
     * <br>
     * {@code registerVendorCapabilities(FluentJPA::setCapabilities);}
     */
    @Local
    static void registerVendorCapabilities(Consumer<Set<Capability>> registrar) {
        registrar.accept(EnumSet.of(Capability.ALIAS_INSERT, Capability.ALIAS_UPDATE, Capability.ALIAS_DELETE));

        ServiceLoader<SQLConfigurator> loader = ServiceLoader.load(SQLConfigurator.class);
        SQLConfigurator SQLConfig = loader.iterator().next();

        SQLConfig.registerMethodSubstitution(String::length, SQL::LENGTH);
    }
}
