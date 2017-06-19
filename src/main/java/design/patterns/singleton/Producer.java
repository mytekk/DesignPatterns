package design.patterns.singleton;

/**
 * Created by RENT on 2017-06-02.
 *
 * klasa, która dodaje dane do jedynego obiektu klasy Queue, czyli naszego singletonu
 */
public class Producer {

    public static void addValue(String value) {

        Queue.getInstance().push(value);
    }

}
