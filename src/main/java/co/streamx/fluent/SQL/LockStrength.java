package co.streamx.fluent.SQL;

public enum LockStrength {
    UPDATE, NO_KEY_UPDATE, SHARE, KEY_SHARE,

    ;

    private final String replaced;

    private LockStrength() {
        replaced = super.toString().replace('_', ' ');
    }

    @Override
    public String toString() {
        return replaced;
    }
}