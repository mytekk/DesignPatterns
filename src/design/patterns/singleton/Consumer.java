package design.patterns.singleton;

/**
 * Created by RENT on 2017-06-02.
 *
 * klasa, która pobiera dane z jedynego obiektu klasy Queue, czyli naszego singletonu
 */
public class Consumer {

    public static void processValue() {

        Queue myQueue = Queue.getInstance();
        System.out.println("Next value is: " + myQueue.pop());
    }

}
