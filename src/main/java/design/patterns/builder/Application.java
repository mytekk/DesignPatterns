package design.patterns.builder;

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
                .build();
        System.out.println(user);
    }
}
