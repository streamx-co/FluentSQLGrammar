package co.streamx.fluent.SQL.Oracle;

import co.streamx.fluent.SQL.DataTypeName;

/**
 * @see <a href="https://docs.oracle.com/cd/B28359_01/server.111/b28318/datatype.htm">Oracle Data Types</a>,
 *      <a href="http://psoug.org/reference/datatypes.html">Data Types</a>
 */
public enum DataTypeNames implements DataTypeName {


    // Character strings
    CHAR, VARCHAR2, NCHAR, NVARCHAR2,

    // LOB Character
    CLOB, NCLOB, LONG,

    // Exact numerics (NUMBER subtypes)
    NUMBER, INT, INTEGER, SMALLINT, DEC, DECIMAL, NUMERIC, DOUBLE_PRECISION, FLOAT, REAL,

    // Approximate numerics
    BINARY_FLOAT, BINARY_DOUBLE,

    // Date and time
    DATE,

    TIMESTAMP, TIMESTAMP_WITH_TIME_ZONE, TIMESTAMP_WITH_LOCAL_TIME_ZONE,

    INTERVAL, INTERVAL_YEAR_TO_MONTH, INTERVAL_DAY_TO_SECOND,

    // Binary data
    RAW, LONG_RAW,

    // Other types
    ROWID, UROWID, XMLType, UriType, SCN,

    // BLOBs
    BLOB, BFILE,

    ;

    private final String replaced;

    private DataTypeNames() {
        String original = super.toString();
        replaced = original.startsWith("BINARY_") ? original : original.replace('_', ' ');
    }

    @Override
    public String toString() {
        return replaced;
    }
}
