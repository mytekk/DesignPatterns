package design.patterns.lambda.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by mytek on 2017-06-20.
 */
public class Application {
    public static void main(String[] args) {

        //trzy obiekty implementujace interfejs
        Action action = new ActionImpl();
        Action action1 = () -> System.out.println("Hello from lambda!"); //implementujemy interfejs za pmoca lambdy. Tutaj lambda to definicja metody "doAction".
        Action action2 = new Action() { //implementujemy interfejs pisząc zagnieżdżoną klasę - anonimową (?)
            @Override
            public void doAction() {
                System.out.println("Hello from lambda - second version!");
            }
        };

        //tworze liste obiektow i dla kazdego z nich odpalam metode doAction
        List<Action> actions = Arrays.asList(action, action1, action2);
        actions.forEach(e -> e.doAction());

        System.out.println("================");

        //lista stringów
        List<String> names = Arrays.asList("Bartek", "Szymon", "Adam", "Anna");

        //wypisanie imion w kolenosci alfabetycznj
        System.out.println("wypisanie imion w kolenosci alfabetycznj");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        //wypisanie wszystkich literek skladowych powyzszych imion, w kolejnosci alfabetycznej, bezpowtorzen
        System.out.println("wypisanie literek");
        names.stream()
                .filter(new BlablaPredicate())  // ?
                .flatMap(e -> Arrays.asList(e.split("")).stream())  // ?
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("================");

        //lista list ze stringami
        List<List<String>> nameList = Arrays.asList(Arrays.asList("Szymon", "Wojciech", "Adam"), Arrays.asList("Anna", "Janina", "Malgorzata"));

        //wypisanie wszystkich imion
        System.out.println("Lista imion");
        System.out.println(nameList);

        //wypisanie imiona na A
        //te trzy poniże filtry są identyczne - ROBIĄ TO SAMO
        System.out.println("Imiona na A");
        nameList.stream()
                .flatMap(e -> e.stream()) // ?
                .filter(e -> e.startsWith("A"))
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.startsWith("A");
                    }
                })
                .sorted()
                .forEach(e -> System.out.println(e));


        System.out.println("================");

        //mapa par string <-> lista_stringów
        Map<String, List<String>> map = new HashMap<>();
        map.put("men", Arrays.asList("Szymon", "Wojciech", "Adam"));
        map.put("woman", Arrays.asList("Anna", "Janina", "Malgorzata"));

        System.out.println("Mapa imion");
        //wypisanie mapy
        System.out.println(map);

        //wypisanie z mapy imion na A
        System.out.println("Imiona na A");
        map.entrySet().stream() // ?
                .map(e -> e.getValue()) // ?
                .flatMap(e -> e.stream()) // ?
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .sorted()
                .forEach(e -> System.out.println(e));

    }
}
