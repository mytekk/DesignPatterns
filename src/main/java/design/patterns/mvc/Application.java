package design.patterns.mvc;

import java.util.Scanner;

/**
 * Created by mytek on 2017-06-21.
 *
 * http://michalorman.pl/blog/2010/03/model-widok-kontroler/
 * https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
 */
public class Application {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 5) {
            counter++;
            System.out.println("Podaj żądanie: ");
            String s = scanner.nextLine();
            frontController.handle(s);
        }

    }
}
