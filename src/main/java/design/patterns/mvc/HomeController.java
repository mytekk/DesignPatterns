package design.patterns.mvc;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-21.
 */
public class HomeController implements Controller {

    @Override
    public Object handle() {
        return new User("Jan", "Kowalski", "123456789", 25, "60-234");
    }
}
