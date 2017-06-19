package design.patterns.dao;

import design.patterns.lombok.User;

import java.util.List;

/**
 * Created by mytek on 2017-06-19.
 *
 * klasa opisująca dostep do danych w bazie MySQL
 *
 * ta klasa jest celowo pozbawiona logiki :)
 */
public class UserDaoInMySQL implements UserDao {

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void addUser(User user) {

    }
}
