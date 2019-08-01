package co.streamx.fluent.SQL;

public interface Record<R> extends Comparable<R> {
    @Override
    default int compareTo(R o) {
        throw new UnsupportedOperationException();
    }
}
