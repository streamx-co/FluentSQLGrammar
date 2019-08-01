package co.streamx.fluent.SQL.TransactSQL;

import co.streamx.fluent.SQL.DataTypeName;

public enum DataTypeNames implements DataTypeName {

    // Exact numerics
    BIGINT,
    /**
     * Synonym for DECIMAL
     */
    NUMERIC, BIT,
    /**
     * INT2
     */
    SMALLINT, DECIMAL, SMALLMONEY,
    /**
     * INT4
     */
    INT,
    /**
     * INT1
     */
    TINYINT, MONEY,

    // Approximate numerics
    /**
     * Double precision (Java double)
     */
    FLOAT,
    /**
     * Single precision (Java float)
     */
    REAL,

    // Date and time
    DATE, DATETIMEOFFSET, DATETIME2, SMALLDATETIME, DATETIME, TIME,

    // Character strings
    CHAR, VARCHAR, TEXT,

    // Unicode character strings
    NCHAR, NVARCHAR, NTEXT,

    // Binary strings
    BINARY, VARBINARY, IMAGE,

    // Other data types
    CURSOR, ROWVERSION, HIERARCHYID, UNIQUEIDENTIFIER, SQL_VARIANT, XML, TABLE,
}
