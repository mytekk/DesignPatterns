package design.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-06-02.
 */
public class Queue {

    //jedyny obiekt naszej klasy, jedyna instancja
    private static Queue instance = null;

    //dziwna metoda zwraca obiekt tego typu
    public static Queue getInstance() {
        if (instance == null) {
            instance = new Queue();
        }
        return instance;
    }

    //pole
    private List<String> values;

    //prywatny konstruktor
    private Queue() {
        values = new ArrayList<>();
    }

    //dodaje element na koncu
    public void push(String value) {
        values.add(value);
    }

    //jesli kolejka jest niepusta to metoda zwraca element
    //w przeciwnym razie zwracamy null
    public String pop() {
        String valueToReturn = null;
        if (values.size() > 0) {
            valueToReturn = values.remove(0); //remove usuwa i zwraca usuwany element
        }
        return valueToReturn;
    }

}
