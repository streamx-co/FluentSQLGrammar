package co.streamx.fluent.SQL.spi;

import static co.streamx.fluent.SQL.Operators.EXISTS;
import static co.streamx.fluent.SQL.Operators.IN;

import java.util.Collection;
import java.util.ServiceLoader;

import co.streamx.fluent.JPA.spi.JPAConfiguration;
import co.streamx.fluent.JPA.spi.SQLConfigurator;
import co.streamx.fluent.SQL.Library;
import co.streamx.fluent.SQL.Operators;
import co.streamx.fluent.SQL.ScalarFunctions;
import co.streamx.fluent.functions.Function1;
import co.streamx.fluent.functions.Function2;

public class SQLConfiguration implements JPAConfiguration {
    public SQLConfiguration() {
        ServiceLoader<SQLConfigurator> loader = ServiceLoader.load(SQLConfigurator.class);
        SQLConfigurator SQLConfig = loader.iterator().next();

        SQLConfig.registerMethodSubstitution(String::concat, ScalarFunctions::CONCAT);
        SQLConfig.registerMethodSubstitution(String::toLowerCase, ScalarFunctions::LOWER);
        SQLConfig.registerMethodSubstitution(String::toUpperCase, ScalarFunctions::UPPER);

        SQLConfig.registerMethodSubstitution(String::replace, ScalarFunctions::REPLACE);
        SQLConfig.registerMethodSubstitution(String::trim, ScalarFunctions::TRIM);
        SQLConfig.registerMethodSubstitution(String::matches, Operators::LIKE);

        SQLConfig.registerMethodSubstitution(
                (Function2<Collection<Comparable>, Comparable, Boolean>) Collection::contains, (collection,
                                                                                                item) -> IN(item,
                                                                                                        collection));

        SQLConfig.registerMethodSubstitution((Function1<Collection<Comparable<?>>, Integer>) c -> c.size(),
                collection -> Library.COUNT());
        SQLConfig.registerMethodSubstitution((Function1<Collection<Comparable<?>>, Boolean>) Collection::isEmpty,
                c -> !EXISTS(c));

        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::abs, ScalarFunctions::ABS);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::acos, ScalarFunctions::ACOS);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::asin, ScalarFunctions::ASIN);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::atan, ScalarFunctions::ATAN);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::ceil, ScalarFunctions::CEILING);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::cos, ScalarFunctions::COS);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::toDegrees, ScalarFunctions::DEGREES);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::exp, ScalarFunctions::EXP);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::floor, ScalarFunctions::FLOOR);

        SQLConfig.registerMethodSubstitution((Function2<Double, Double, Double>) Math::pow, ScalarFunctions::POWER);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::toRadians, ScalarFunctions::RADIANS);
        // SQLConfig.registerMethodSubstitution((Function0<Double>) Math::random, ScalarFunctions::<no standard>);
        // ROUND approach differs between java to SQL
        // SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::round, ScalarFunctions::ROUND);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::signum, ScalarFunctions::SIGN);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::sin, ScalarFunctions::SIN);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::sqrt, ScalarFunctions::SQRT);
        SQLConfig.registerMethodSubstitution((Function1<Double, Double>) Math::tan, ScalarFunctions::TAN);
    }
}
