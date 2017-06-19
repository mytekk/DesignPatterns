package design.patterns.lombok;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-14.
 */
public class Application {
    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Szymon")
                .lastName("Nowak")
                .age(23)
                .phoneNumber("123456789")
                .zipCode("60-123")
                .build();
        System.out.println(user);
    }
}
