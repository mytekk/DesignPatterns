package design.patterns.mvc;

import design.patterns.lombok.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mytek on 2017-06-21.
 */
public class FrontController {

    private Map<String, Controller> controllers;
    private Map<String, View> views;

    //konstruktor
    public FrontController() {
        controllers = new HashMap<>();
        views = new HashMap<>();

        //pomocnicze metody inicjalizujące
        setupControllers();
        setupViews();
    }

    private void setupViews() {
        views.put("json", new JsonView());
        views.put("html", new HtmlView());
    }

    private void setupControllers() {
        controllers.put("home", new HomeController());
        controllers.put("about", new AboutController());
    }

    //funkcja ta odpowiada za obsługę np. takiej przekazanej wartości: handle("home.json")
    public void handle(String value) {
        String[] split = value.split(" ");
        Object resultObject;

        //czy w value od usera jest poprawna nazwa jakiegos kontrolera?
        if (controllers.containsKey(split[0])) {
            //1. Wybieramy controller wskazany w value i wywolujemy jego metode ktora zwraca obiekt
            Controller controller = controllers.get(split[0]);
            resultObject = controller.handle();

            //2. Wywolujemy widok przekazany uprzednio w value
            if (views.containsKey(split[1])) {
                View<User> view = views.get(split[1]);
                System.out.println(view.home((User) resultObject));
            }

        } else {
            System.out.println("Controller for " + split[0] + " not found!");
        }

    }

}
