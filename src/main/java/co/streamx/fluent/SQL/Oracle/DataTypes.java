package co.streamx.fluent.SQL.Oracle;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

import co.streamx.fluent.SQL.DataType;

public interface DataTypes {

    final DataType<Timestamp> TIMESTAMP = DataTypeNames.TIMESTAMP.create();
    final DataType<Date> DATE = DataTypeNames.DATE.create();
    final DataType<Timestamp> INTERVAL = DataTypeNames.INTERVAL.create();

    /**
     * 2 bytes
     */
    final DataType<Short> SHORT = DataTypeNames.SMALLINT.create();

    /**
     * 4 bytes
     */
    final DataType<Integer> INT = DataTypeNames.INT.create();

    /**
     * 8 bytes
     */
    final DataType<Long> LONG = DataTypeNames.INT.create();

    final DataType<BigDecimal> BigDecimal = DataTypeNames.NUMBER.create();
    final DataType<BigInteger> BigInteger = DataTypeNames.NUMBER.create();

    final DataType<Float> FLOAT = DataTypeNames.REAL.create();
    final DataType<Double> DOUBLE = DataTypeNames.FLOAT.create();

    final DataType<Long> SCN = DataTypeNames.SCN.create();
}
