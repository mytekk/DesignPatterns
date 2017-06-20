package design.patterns.lambda.examples;

import java.util.function.Predicate;

/**
 * Created by mytek on 2017-06-20.
 */
public class UserPredicateFactory {

    public static Predicate<String> nameStartsWith(String prefix) {
        //podejscie "tradycyjne", stare
        /*
        return new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith(prefix);
            }
        };
        */

        //podejście nowe
        //lambda - to tutaj anonimowa implementacja interfejsu z jedną metodą
        return e -> e.startsWith(prefix);
    }

}
