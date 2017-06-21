package design.patterns.queue;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-21.
 */
public class FifoQueue extends AbstractQueue {

    @Override
    public void push(User user) {
        users.add(user); //dodaje element na koniec kolejki
    }
}
