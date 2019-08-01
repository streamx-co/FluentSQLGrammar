package co.streamx.fluent.SQL;

public enum FrameBounds {
    UNBOUNDED_PRECEDING, PRECEDING, CURRENT_ROW, FOLLOWING, UNBOUNDED_FOLLOWING,

    ;

    private final String replaced;

    private FrameBounds() {
        replaced = super.toString().replace('_', ' ');
    }

    @Override
    public String toString() {
        return replaced;
    }
}