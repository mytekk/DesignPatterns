package design.patterns.mvc;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-21.
 */
public class HtmlView implements View<User> {

    @Override
    public String home(User model) {
        return new StringBuilder()
                .append("<h1>" + model.getFirstName() + " " + model.getLastName() + "</h1>\n")
                .append("<h3>Age: " + model.getAge() + "</h3>\n")
                .append("<p>PhoneNumber: " + model.getPhoneNumber() + "</p>\n")
                .toString();
    }
}
