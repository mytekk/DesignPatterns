package design.patterns.dao;

import design.patterns.lombok.User;

import java.io.File;
import java.util.List;

/**
 * Created by mytek on 2017-06-19.
 *
 * głowna klasa programu
 * definiujemy nasz dostęp do danych (albo z pliku, albo z pamięci, albo w bazy danych),
 * dodajemy nowego usera
 * pobieramy listę wszystkich userów
 * wyświeltamy wszystkich userów
 */
public class Application {

    public static final String PATH = "C:\\Users\\mytek\\IdeaProjects\\DesignPatterns\\src\\main\\java\\design\\patterns\\dao\\users";

    public static void main(String[] args) {
        UserDao userDao = new UserDaoInFile(new File(PATH));
        //UserDao userDao = new UserDaoInMemory();
        //UserDao userDao = new UserDaoInMySQL(); //tutaj program sie wysypie przy wyswietlaniu userow, bo ich lista jest nullem

        userDao.addUser(User.builder()
                .firstName("Bartłomiej")
                .lastName("Mytko")
                .phoneNumber("8499583")
                .age(32)
                .zipCode("60-432")
                .build());

        List<User> allUsers = userDao.getAllUsers();

        allUsers.forEach(e -> System.out.println(e));
        //allUsers.forEach(System.out::println);
    }

}
