package design.patterns.dao;

import design.patterns.lombok.User;

import java.util.List;

/**
 * Created by mytek on 2017-06-19.
 *
 * interfejs opisuący w jaki sposób będziemy dobierali się do danych
 * tutaj nie interesuje nas skąd pochodzą dane (baza danych, plik, pamięć, itp...)
 */
public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

}
