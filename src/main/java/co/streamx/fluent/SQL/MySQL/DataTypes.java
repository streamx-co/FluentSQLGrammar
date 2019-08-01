package co.streamx.fluent.SQL.MySQL;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import co.streamx.fluent.SQL.DataType;

public interface DataTypes {

    final DataType<Date> DATE = DataTypeNames.DATE.create();
    final DataType<Date> DATETIME = DataTypeNames.DATETIME.create();
    final DataType<Timestamp> TIMESTAMP = DataTypeNames.TIMESTAMP.create();
    final DataType<Time> TIME = DataTypeNames.TIME.create();

    /**
     * 1 byte
     */
    final DataType<Byte> TINYINT = DataTypeNames.TINYINT.create();

    /**
     * 2 bytes
     */
    final DataType<Short> SMALLINT = DataTypeNames.SMALLINT.create();

    /**
     * 3 bytes
     */
    final DataType<Integer> MEDIUMINT = DataTypeNames.MEDIUMINT.create();

    /**
     * 4 bytes
     */
    final DataType<Integer> INT = DataTypeNames.INTEGER.create();

    /**
     * 8 bytes
     */
    final DataType<Long> BIGINT = DataTypeNames.BIGINT.create();

    final DataType<BigDecimal> DECIMAL = DataTypeNames.NUMERIC.create();
    final DataType<BigDecimal> NUMERIC = DataTypeNames.NUMERIC.create();

    final DataType<Float> FLOAT = DataTypeNames.FLOAT.create();
    final DataType<Double> DOUBLE = DataTypeNames.DOUBLE.create();

}
