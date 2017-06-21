package design.patterns.queue;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-21.
 */
public class LifoQueue extends AbstractQueue {

    @Override
    public void push(User user) {
        users.add(0, user); //dodaje element na początek kolejki
    }
}
