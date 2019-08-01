package co.streamx.fluent.SQL;

public enum Keywords implements Keyword {

    /**
     * Translates to {@code *}
     */
    ASTERISK {
        @Override
        public String toString() {
            return "*";
        }
    }
}
