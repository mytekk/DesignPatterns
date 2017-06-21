package design.patterns.queue;

import design.patterns.lombok.User;

/**
 * Created by mytek on 2017-06-21.
 */
public class Application {
    public static void main(String[] args) {
        Queue queue = new FifoQueue();
        queue.push(new User("Szymon", "Nowak", "1234", 23, "60-123"));
        queue.push(new User("Jan", "Kowalski", "1234", 23, "60-123"));

        //zabieram i wypisuję zabrany element
        System.out.println(queue.pop());

        queue.push(new User("kjanlkh", "afsfa", "1234", 23, "60-123"));

        //zabieram i wypisuję zabrany element
        System.out.println(queue.pop());
    }
}
