package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Local;

public interface DataTypeName {
    @Local
    default <T extends Comparable<? super T>> DataType<T> create() {
        String typeName = toString();
        return DataType.create(typeName);
    }

    @Local
    default <T extends Comparable<? super T>> DataType<T> create(int length) {
        DataType<T> created = create();
        return created.length(length);
    }

    @Local
    default <T extends Comparable<? super T>> DataType<T> create(int precision,
                                                                 int scale) {
        DataType<T> created = create();
        return created.numeric(precision, scale);
    }
}
