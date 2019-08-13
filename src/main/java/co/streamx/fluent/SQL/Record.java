package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Function;

public interface Record<R> extends Comparable<R> {
    @Override
    default int compareTo(R o) {
        throw new UnsupportedOperationException();
    }

    @Function(name = "ORDER BY", omitParentheses = true)
    default Record<R> ORDER(SortOrder... sorts) {
        throw new UnsupportedOperationException();
    }
}
