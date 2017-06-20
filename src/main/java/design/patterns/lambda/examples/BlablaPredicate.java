package design.patterns.lambda.examples;

import java.util.function.Predicate;

/**
 * Created by mytek on 2017-06-20.
 */
public class BlablaPredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return true;
    }
}
