package design.patterns.lombok;

import design.patterns.lombok.User;

import java.util.Arrays;
import java.util.List;

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

        System.out.println("===========");


        List<String> values = Arrays.asList("Szymon;Nowak;+48 12345678;23;60-123", "Michal;Wisniewski;987654345;33;60-456", "Anna;Kowalska;94726384;45;60-789");

        values.stream()
                .map(e -> {
                    String[] split = e.split(";");
                    return new User(split[0], split[1], split[2], Integer.parseInt(split[3]), split[4]);
                })
                .filter(e -> e.getAge() > 25)
                .forEach(System.out::println);

    }
}
