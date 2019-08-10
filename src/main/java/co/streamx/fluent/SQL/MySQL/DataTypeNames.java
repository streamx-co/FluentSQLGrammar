package co.streamx.fluent.SQL.MySQL;

import co.streamx.fluent.SQL.DataTypeName;

/**
 * @see <a href="https://dev.mysql.com/doc/refman/8.0/en/data-types.html">Data Types</a>
 */
public enum DataTypeNames implements DataTypeName {

    // Exact numerics
    TINYINT, SMALLINT, MEDIUMINT, INTEGER, BIGINT, DECIMAL,
    /**
     * Synonym for DECIMAL
     */
    NUMERIC,

    // Approximate numerics
    /**
     * Single precision (Java float)
     */
    FLOAT,
    /**
     * Alias: DOUBLE PRECISION (Java double)
     */
    DOUBLE,

    // Bit strings
    BIT,

    // Character strings
    CHAR, VARCHAR,

    // Binary strings
    BINARY, VARBINARY,

    // Date and time
    DATE, DATETIME, TIMESTAMP, TIME, YEAR,

    INTERVAL, // see DATE_ADD

    // BLOBs
    TINYBLOB, BLOB, MEDIUMBLOB, LONGBLOB,

    // TEXTs
    TINYTEXT, TEXT, MEDIUMTEXT, LONGTEXT,

    // Spatial data types
    GEOMETRY, POINT, LINESTRING, POLYGON, MULTIPOINT, MULTILINESTRING, MULTIPOLYGON, GEOMETRYCOLLECTION,

    // JSON data types
    JSON,
}
