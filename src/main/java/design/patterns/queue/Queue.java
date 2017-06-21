package design.patterns.queue;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-21.
 */
public interface Queue {
    void push(User user);
    User pop();
}
