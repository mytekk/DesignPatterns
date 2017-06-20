package design.patterns.lambda.examples;

/**
 * Created by mytek on 2017-06-20.
 *
 * implementacja interfejsu
 */
public class ActionImpl implements Action {
    @Override
    public void doAction() {
        System.out.println("I am doing my action!");
    }
}
