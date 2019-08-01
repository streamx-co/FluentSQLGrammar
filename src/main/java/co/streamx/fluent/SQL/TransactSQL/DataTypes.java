package co.streamx.fluent.SQL.TransactSQL;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import co.streamx.fluent.SQL.DataType;

/**
 * Common not varying Transact SQL data types.
 * 
 * To create a variable precision, scale or length types, use the appropriate create overload. e.g.
 * {@code DataTypeNames.VARCHAR.create(255)}
 * 
 * @see <a href="https://docs.microsoft.com/en-us/sql/connect/jdbc/using-basic-data-types?view=sql-server-2017">JDBC
 *      Data Type Mappings</a>
 */
public interface DataTypes {

    final DataType<Date> DATE = DataTypeNames.DATE.create();
    final DataType<Timestamp> DATETIME = DataTypeNames.DATETIME.create();
    final DataType<Timestamp> DATETIME2 = DataTypeNames.DATETIME2.create();
    final DataType<Timestamp> DATETIMEOFFSET = DataTypeNames.DATETIMEOFFSET.create();
    final DataType<Timestamp> SMALLDATETIME = DataTypeNames.SMALLDATETIME.create();
    final DataType<Time> TIME = DataTypeNames.TIME.create();

    /**
     * BIT
     */
    final DataType<Boolean> BIT = DataTypeNames.BIT.create();

    /**
     * 1 unsigned byte (0 - 255)
     */
    final DataType<Short> TINYINT = DataTypeNames.TINYINT.create();

    /**
     * 2 bytes
     */
    final DataType<Short> SMALLINT = DataTypeNames.SMALLINT.create();

    /**
     * 4 bytes
     */
    final DataType<Integer> INT = DataTypeNames.INT.create();

    /**
     * 8 bytes
     */
    final DataType<Long> BIGINT = DataTypeNames.BIGINT.create();

    final DataType<BigDecimal> MONEY = DataTypeNames.MONEY.create();
    final DataType<BigDecimal> SMALLMONEY = DataTypeNames.SMALLMONEY.create();
    final DataType<BigDecimal> DECIMAL = DataTypeNames.DECIMAL.create();
    final DataType<BigDecimal> NUMERIC = DataTypeNames.NUMERIC.create();

    /**
     * REAL - FLOAT(24)
     */
    final DataType<Float> REAL = DataTypeNames.REAL.create();

    /**
     * FLOAT - FLOAT(53)
     */
    final DataType<Double> FLOAT = DataTypeNames.FLOAT.create();

    final DataType<String> UNIQUEIDENTIFIER = DataTypeNames.UNIQUEIDENTIFIER.create();
}
