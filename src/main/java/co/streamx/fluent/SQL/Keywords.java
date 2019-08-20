package co.streamx.fluent.SQL;

import co.streamx.fluent.notation.Keyword;

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
