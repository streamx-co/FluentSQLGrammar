package co.streamx.fluent.SQL.MySQL;

// String
public enum SearchMode {
    IN_NATURAL_LANGUAGE_MODE, IN_NATURAL_LANGUAGE_MODE_WITH_QUERY_EXPANSION, IN_BOOLEAN_MODE, WITH_QUERY_EXPANSION,

    ;

    private final String replaced;

    private SearchMode() {
        replaced = super.toString().replace('_', ' ');
    }

    @Override
    public String toString() {
        return replaced;
    }

}