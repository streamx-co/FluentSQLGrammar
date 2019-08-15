package co.streamx.fluent.SQL;

import static co.streamx.fluent.SQL.ScalarFunctions.CAST;

import java.text.MessageFormat;

import co.streamx.fluent.notation.Function;
import co.streamx.fluent.notation.Literal;
import co.streamx.fluent.notation.Local;

/**
 * Abstracts mapping from vendor SQL types to Java types.
 * 
 * @param <T> The mapped Java type.
 */
public interface DataType<T extends Comparable<? super T>> {

    /**
     * Creates a literal (string) constant of "this" type. E.g. {@code DATE '2001-10-08'}<br>
     * <i>Note</i>, that some vendors (e.g. SQL Server) don't support this syntax. In this case use
     * {@link #cast(Comparable) cast} instead.
     * 
     * @param constant (Not field!). Must be formatted according to vendor specification for the current type. E.g.
     *                 {@code "2001-10-08"} for DATE
     */
    @Function(name = "", omitArgumentsDelimiter = true, omitParentheses = true)
    default T of(String constant) {
        throw new UnsupportedOperationException();
    }

    /**
     * Perform the same operation as {@link #of(String)} and adds {@code postfix} at the end
     */
    @Function(name = "", omitArgumentsDelimiter = true, omitParentheses = true)
    default T of(String constant,
                 Keyword postfix) {
        throw new UnsupportedOperationException();
    }

    /**
     * Perform the same operation as {@link #of(String)} and adds {@code postfix} at the end
     */
    @Function(name = "", omitArgumentsDelimiter = true, omitParentheses = true)
    default T of(@Literal long constant) {
        throw new UnsupportedOperationException();
    }

    /**
     * Perform the same operation as {@link #of(String)} and adds {@code postfix} at the end
     */
    @Function(name = "", omitArgumentsDelimiter = true, omitParentheses = true)
    default T of(@Literal long constant,
                 Keyword postfix) {
        throw new UnsupportedOperationException();
    }

    /**
     * Casts, but outputs the {@code value} as a string.
     */
    default T raw(String value) {
        @SuppressWarnings("unchecked")
        T x = (T) value;
        return x;
    }

    /**
     * Casts the {@code expression}. See {@link ScalarFunctions#CAST(Comparable, DataType) CAST}.
     */
    default <E extends Comparable<E>> T cast(E expression) {
        return CAST(expression, this);
    }

    /**
     * Appends {@code length} modifier to "this" type. E.g. {@code VARCHAR(255)}. The mapped Java type
     * ({@link DataType}} is preserved.
     */
    @Local
    default DataType<T> length(int length) {
        String typeName = toString() + '(' + length + ')';
        return create(typeName);
    }

    /**
     * Appends {@code precision} modifier to "this" type. E.g. {@code NUMERIC(255)}. The mapped Java type
     * ({@link DataType}} is preserved.
     */
    @Local
    default DataType<T> numeric(int precision) {
        String typeName = toString() + '(' + precision + ')';
        return create(typeName);
    }

    @Local
    default DataType<T> numeric(int precision,
                                int scale) {
        String typeName = toString() + '(' + precision + ',' + scale + ')';
        return create(typeName);
    }

    /**
     * Create a derived type. Uses {@link MessageFormat#format(Object)} for formatting. {@code this} is passed as an
     * argument.
     * 
     * <pre>
     * <code>
     * // produces DATE[] type
     * DATE.derive("{0}[]");</code>
     * </pre>
     * 
     */
    @Local
    default <D extends Comparable<? super D>> DataType<D> derive(String pattern) {
        String typeName = MessageFormat.format(pattern, this);
        return create(typeName);
    }

    /**
     * Create a new SQL Type &lt;-&gt; Java type mapping
     * 
     * @param <T>      The Java type.
     * @param typeName The SQL type name.
     */
    @Local
    static <T extends Comparable<? super T>> DataType<T> create(String typeName) {
        return new DataType<T>() {
            @Override
            public String toString() {
                return typeName;
            }
        };
    }
}
