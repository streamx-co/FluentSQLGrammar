package co.streamx.fluent.SQL.PostgreSQL;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import co.streamx.fluent.SQL.DataType;

public interface DataTypes {

    final DataType<Timestamp> TIMESTAMP = DataTypeNames.TIMESTAMP.create();
    final DataType<Date> DATE = DataTypeNames.DATE.create();
    final DataType<Time> TIME = DataTypeNames.TIME.create();
    final DataType<Timestamp> INTERVAL = DataTypeNames.INTERVAL.create();

    /**
     * 2 bytes
     */
    final DataType<Short> SMALLINT = DataTypeNames.SMALLINT.create();

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

    final DataType<Float> REAL = DataTypeNames.REAL.create();
    final DataType<Double> DOUBLE = DataTypeNames.FLOAT8.create();

    // Serial types effectively create an appropriate integer column type

    final DataType<BigDecimal> MONEY = DataTypeNames.MONEY.create();

    final DataType<Boolean> BOOLEAN = DataTypeNames.BOOLEAN.create();
}
