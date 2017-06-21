package design.patterns.queue;

import design.patterns.lombok.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mytek on 2017-06-21.
 *
 * klasa abstrakcyjna implementuje interfejs Queue (ale nie wszystkie jego elementy)
 * ponieważ zaiwera tylko elementy wspólne dla klas, które będą tę klasę rozszerzeć (extends)
 * dzięki temu klasy Lifo i Fifo nie muszą zaiwerać powtarzalnego kodu (jest wyniosiony do klasy abstrakcyjnej którą rozszerzają)
 * i zawierają jedynie definicję metody push, ponieważ implementacją tej metody róznią się od siebie
 */
public abstract class AbstractQueue implements Queue {

    protected List<User> users;

    public AbstractQueue() {
        users = new ArrayList<>();
    }

    @Override
    public User pop() {
        return !users.isEmpty() ? users.remove(0) : null; //lifo i fifo przy operacji pop sciągają z kolejki element najstarszy, czyli ten na początku
    }
}
