package design.patterns.dao;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-19.
 *
 * klasa pomocnicza, opisuje jak przerabiać obiekt User na String i odwrotnie
 * wykorzystywana w klasie definiującej dostęp do danych w pliku (UserDaoInFile)
 */
public class UserMapper {

    //przerabia stringa z informacjami o userze na obiekt User
    //format stringa musi być taki jak w paczce lombok, w pliku application
    //czyli zgodny z tamtejsza klasa User
    public User map(String userInString) {
        String[] split = userInString.split(";");
        return new User(split[0], split[1], split[2], Integer.parseInt(split[3]), split[4]);
    }

    //przerabia obiekt typu User na stringa
    //dba o to, zeby format stringa był wlasciwy z tym co jest w paczce lombok, w pliku application
    //czyli zgodny z tamtejsza klasa User
    public String map(User user) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append(user.getFirstName())
                .append(";")
                .append(user.getLastName())
                .append(";")
                .append(user.getPhoneNumber())
                .append(";")
                .append(user.getAge())
                .append(";")
                .append(user.getZipCode())
                .toString();
    }
}
