package design.patterns.builder;

/**
 * Created by mytek on 2017-06-14.
 *
 * http://kobietydokodu.pl/main-8-lutego-2016/
 * http://lukasz-socha.pl/php/wzorce-projektowe-cz-9-builder/
 */
public class User {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;

    // GETTERY I SETTERY
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }

    //statyczna metoda builder zwracająca obiekt klasy UserBuilder - ta klasa zdefiniowana jest poniżej
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    //nowa klasa - w klasie
    public static class UserBuilder {

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private int age;

        //to są te funkcje, które po kropce są wywoływane w mainie
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setPhoneNumber(phoneNumber);
            user.setAge(age);

            return user;
        }
    }
}
