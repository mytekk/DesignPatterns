package design.patterns.dao;

import design.patterns.lombok.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mytek on 2017-06-19.
 *
 * klasa obsługująca dostęp do danych w pliku
 */
public class UserDaoInFile implements UserDao {

    private File file;

    //konstruktor
    public UserDaoInFile(File file) {
        this.file = file;
    }

    @Override
    public List<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            UserMapper userMapper = new UserMapper();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                users.add(userMapper.map(line));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public void addUser(User user) {
        try (
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw);
        ) {
            UserMapper userMapper = new UserMapper();
            out.println(userMapper.map(user));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
