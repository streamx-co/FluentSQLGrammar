package co.streamx.fluent.SQL.PostgreSQL;

import co.streamx.fluent.SQL.DataTypeName;

/**
 * @see <a href="https://www.postgresql.org/docs/current/datatype.html">Data Types</a>
 */
public enum DataTypeNames implements DataTypeName {

    // Exact numerics
    SMALLINT, INTEGER, BIGINT, // DECIMAL,
    /**
     * Synonym for DECIMAL
     */
    NUMERIC,

    // Autoincrementing
    SMALLSERIAL, SERIAL, BIGSERIAL,

    // Approximate numerics
    /**
     * Single precision (Java float)
     */
    REAL,
    /**
     * Alias: DOUBLE PRECISION (Java double)
     */
    FLOAT8,

    // Monetary
    MONEY,

    // Character strings
    VARCHAR, CHAR, TEXT,

    // Binary strings
    BYTEA,

    // Date and time
    TIMESTAMP, TIMESTAMP_WITH_TIME_ZONE {
        @Override
        public String toString() {
            return "TIMESTAMP WITH TIME ZONE";
        }
    },
    DATE, TIME, TIME_WITH_TIME_ZONE {
        @Override
        public String toString() {
            return "TIME WITH TIME ZONE";
        }
    },
    INTERVAL,

    // Boolean
    BOOLEAN,

    // Geometry data types
    BOX, CIRCLE, LINE, LSEG, PATH, POINT, POLYGON,

    // network data types
    CIDR, INET, MACADDR, MACADDR8,

    // Bit strings
    BIT, VARBIT,

    // textsearch data types
    TSQUERY, TSVECTOR,

    // JSON data types
    JSON, JSONB,

    // Other data types
    UUID, XML, OID, PG_LSN, TXID_SNAPSHOT
}
