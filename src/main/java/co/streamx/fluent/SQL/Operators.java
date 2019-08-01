package co.streamx.fluent.SQL;

import java.util.Collection;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Operator;

public interface Operators {

    // Set operators
    @Function(omitParentheses = true)
    static void EXCEPT() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static void INTERSECT() {
        throw new UnsupportedOperationException();
    }

    /**
     * Same as UNION DISTINCT
     */
    @Function(omitParentheses = true)
    static void UNION() {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static void UNION_ALL() {
        throw new UnsupportedOperationException();
    }

    // Logical operators
    @Function(omitParentheses = true)
    static <T extends Comparable<? super T>> T ALL(T subQuery) {
        throw new UnsupportedOperationException();
    }

    @Function
    @Operator(omitParentheses = true)
    static boolean AND(boolean left,
                       boolean right) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static <T extends Comparable<? super T>> T ANY(T subQuery) {
        throw new UnsupportedOperationException();
    }

    @Function(argumentsDelimiter = " AND")
    @Operator(omitParentheses = true)
    static <T> boolean BETWEEN(T expressionToMatch,
                               T lowLimit,
                               T highLimit) {
        throw new UnsupportedOperationException();
    };

    @Function
    @Operator(omitParentheses = true)
    static String COLLATE(String expression,
                           String collation) {
        throw new UnsupportedOperationException();
    };

    @Function(omitParentheses = true)
    static boolean EXISTS(Object subQuery) {
        throw new UnsupportedOperationException();
    }

    @SafeVarargs
    @Function
    @Operator
    static <T extends Comparable<T>> boolean IN(T expressionToMatch,
                                                T... valuesOrCollectionOrSubQuery) {
        throw new UnsupportedOperationException();
    };

    @Function
    @Operator(omitParentheses = true)
    static <T extends Comparable<T>> boolean IN(T expressionToMatch,
                                                Collection<? super T> collection) {
        throw new UnsupportedOperationException();
    };

    @Function
    @Operator(omitParentheses = true)
    static boolean LIKE(String stringToMatch,
                        String pattern) {
        throw new UnsupportedOperationException();
    };

    @Function(argumentsDelimiter = " ESCAPE")
    @Operator(omitParentheses = true)
    static boolean LIKE(String stringToMatch,
                        String pattern,
                        char escapeCharacter) {
        throw new UnsupportedOperationException();
    };

    @Function
    @Operator(omitParentheses = true)
    static boolean SIMILAR_TO(String stringToMatch,
                              String pattern) {
        throw new UnsupportedOperationException();
    };

    @Function(argumentsDelimiter = " ESCAPE")
    @Operator(omitParentheses = true)
    static boolean SIMILAR_TO(String stringToMatch,
                              String pattern,
                              char escapeCharacter) {
        throw new UnsupportedOperationException();
    };

    @Function
    @Operator(right = false)
    static <T> boolean NOT(boolean expression) {
        throw new UnsupportedOperationException();
    };

    @Function
    @Operator(omitParentheses = true)
    static boolean OR(boolean left,
                      boolean right) {
        throw new UnsupportedOperationException();
    }

    @Function(omitParentheses = true)
    static <T extends Comparable<? super T>> T SOME(T subQuery) {
        throw new UnsupportedOperationException();
    }

    // relational comparison

    @Function(name = "=")
    @Operator(omitParentheses = true)
    static <T extends Comparable<T>> boolean equal(T left,
                                                   T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "!=")
    @Operator(omitParentheses = true)
    static <T extends Comparable<T>> boolean notEqual(T left,
                                                      T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "<")
    @Operator(omitParentheses = true)
    static <T extends Comparable<T>> boolean less(T left,
                                                  T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "<=")
    @Operator(omitParentheses = true)
    static <T extends Comparable<T>> boolean lessEqual(T left,
                                                       T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = ">")
    @Operator(omitParentheses = true)
    static <T extends Comparable<T>> boolean greater(T left,
                                                     T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = ">=")
    @Operator(omitParentheses = true)
    static <T extends Comparable<T>> boolean greaterEqual(T left,
                                                          T right) {
        throw new UnsupportedOperationException();
    }

    // Math
    @Function(name = "+")
    @Operator(omitParentheses = true)
    static <T extends Comparable<? super T>> T add(T left,
                                                   T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "-")
    @Operator(omitParentheses = true)
    static <T extends Comparable<? super T>> T subtract(T left,
                                                        T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "*")
    @Operator(omitParentheses = true)
    static <T extends Number, T1 extends Number> T multiply(T left,
                                                            T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "/")
    @Operator(omitParentheses = true)
    static <T extends Number, T1 extends Number> T divide(T left,
                                                          T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "%")
    @Operator(omitParentheses = true)
    static <T extends Number, T1 extends Number> T1 modulo(T left,
                                                           T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "^")
    @Operator(omitParentheses = true)
    static <T extends Number, T1 extends Number> T exponent(T left,
                                                            T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "!")
    @Operator(omitParentheses = true)
    static <T extends Number> T factorial(T left) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "&")
    @Operator(omitParentheses = true)
    static <T extends Number> T bitwiseAND(T left,
                                           T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "|")
    @Operator(omitParentheses = true)
    static <T extends Number> T bitwiseOR(T left,
                                          T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "~")
    @Operator(omitParentheses = true, right = false)
    static <T extends Number> T bitwiseNOT(T left) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "<<")
    @Operator(omitParentheses = true)
    static <T extends Number> T shiftLeft(T left,
                                          T right) {
        throw new UnsupportedOperationException();
    }

    @Function(name = ">>")
    @Operator(omitParentheses = true)
    static <T extends Number> T shiftRight(T left,
                                           T right) {
        throw new UnsupportedOperationException();
    }
}
