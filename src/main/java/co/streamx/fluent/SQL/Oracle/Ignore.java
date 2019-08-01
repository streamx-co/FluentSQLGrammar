package co.streamx.fluent.SQL.Oracle;

public enum Ignore {
    NULLS {
        @Override
        public String toString() {
            return "IGNORE NULLS";
        }
    }
}
