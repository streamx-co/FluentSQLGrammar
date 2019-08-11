package co.streamx.fluent.SQL.MySQL;

import java.sql.Timestamp;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.EnumSet;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Consumer;

import co.streamx.fluent.JPA.spi.SQLConfigurator;
import co.streamx.fluent.notation.Capability;
import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Local;
import co.streamx.fluent.notation.Operator;

public interface SQL {

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
    static void LIMIT(long rowCount) {
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
    static <T extends Comparable<? super T>> T ADDDATE(T date,
                                                       Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Comparable<? super T>> T ADDDATE(T date,
                                                       int days) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Comparable<? super T>> T ADDTIME(T date,
                                                       Comparable<?> time) {
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

    @Function
    static int DATEDIFF(String from,
                        String to) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Comparable<? super T>> T DATE_ADD(T date,
                                                        Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Comparable<? super T>> T DATE_SUB(T date,
                                                        Timestamp interval) {
        throw new UnsupportedOperationException();
    }

    @Function
    static String DATEFORMAT(Date date,
                             String format) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Date> T STR_TO_DATE(String date,
                                          String format) {
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
