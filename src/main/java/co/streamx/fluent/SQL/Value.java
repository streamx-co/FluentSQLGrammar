package co.streamx.fluent.SQL;

import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.notation.Alias;

public interface Value<T extends Comparable<? super T>> {

    @Alias
    T AS();

    @Alias
    T AS(String alias);

    @Alias
    <TEntity> T AS(Function1<TEntity, T> alias);
}
