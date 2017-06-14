package design.patterns.singleton;

import java.util.Scanner;

/**
 * Created by RENT on 2017-06-02.
 *
 * klasa demonstruująca działąnie singletonu
 */
public class Application {
    public static void main(String[] args) {

        System.out.println("Hello, please add value do queue or take value from queue.");

        Scanner scanner = new Scanner(System.in);

        //w nieskończonej pętli dodajemy lub odczytujemy wartosci z kolejki
        //dodanie jest wtedy kiedy coś wpiszemy i wcisniemy enter
        //a odczyt do samo wciesniecie enter, czyli pusty string
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("")) { //wduszenie enter odczytuje pierwszy element z kolejki
                Consumer.processValue();
            } else {
                Producer.addValue(value);
            }
        }


    }
}
