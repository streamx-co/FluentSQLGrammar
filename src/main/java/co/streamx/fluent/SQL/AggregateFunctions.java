package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface AggregateFunctions {

    @Function
    static <T extends Number> T AVG(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int GROUPING(Object... expressions) {
        throw new UnsupportedOperationException();
    }

    @Function
    static int COUNT(Comparable<?> expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Comparable<? super T>> T MAX(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Comparable<? super T>> T MIN(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T SUM(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T STDDEV(Number expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Number> T STDDEV_POP(Number expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Number> T STDDEV_SAMP(Number expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T extends Number> T VARIANCE(Number expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Number> T VAR_POP(Number expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T extends Number> T VAR_SAMP(Number expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long ROW_NUMBER() {
        throw new UnsupportedOperationException();
    }

    @Function
    static int RANK() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int DENSE_RANK() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double PERCENTILE_CONT(double percentile) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static double PERCENTILE_DISC(double percentile) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static long PERCENT_RANK() {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static int CUME_DIST() {
        throw new UnsupportedOperationException();
    }

    @Function
    static int NTILE(int num_buckets) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T LAG(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T LAG(T expression,
                     int offset) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T LAG(T expression,
                     int offset,
                     T defaultValue) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T LEAD(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T LEAD(T expression,
                      int offset) {
        throw new UnsupportedOperationException();
    }

    @Function
    static <T> T LEAD(T expression,
                      int offset,
                      T defaultValue) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T FIRST_VALUE(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T LAST_VALUE(T expression) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static <T> T NTH_VALUE(T expression,
                           int nth) {
        throw new UnsupportedOperationException();
    }

    @Function(underscoresAsBlanks = false)
    static String STRING_AGG(Object expression,
                             String separator) {
        throw new UnsupportedOperationException();
    }
}
