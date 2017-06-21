package design.patterns.mvc;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-21.
 */
public class AboutController implements Controller {

    @Override
    public Object handle() {
        return new User("Bartek", "Mytko", "895314529", 31, "60-123");
    }
}
