package design.patterns.dao;

import design.patterns.lombok.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mytek on 2017-06-19.
 *
 * klasa obsługująca dostęp do danych w pamięci
 */
public class UserDaoInMemory implements UserDao {

    private List<User> users;

    //konstruktor
    public UserDaoInMemory() {
        this.users = new ArrayList<>();

        users.add(User.builder()
                .firstName("Szymon")
                .lastName("Nowak")
                .age(23)
                .phoneNumber("123456789")
                .zipCode("60-123")
                .build());

        users.add(User.builder()
                .firstName("Anna")
                .lastName("Kowalska")
                .age(40)
                .phoneNumber("09876543")
                .zipCode("62-234")
                .build());

    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
