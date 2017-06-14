package design.patterns.chain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by RENT on 2017-06-02.
 *
 * właściwa klasa będąca łańcuchem odpowiedzialności
 */
public class EmergencyChainOfResponsibility {

    private List<ChainElement> chain;   //ogniwa, elementy łańcucha przechowujemy w LIŚCIE

    //konstruktor - do łańcucha dodajemy elementy (obiekty klas implementujących interfejs ChainElement), łańcuch jest typu ArrayList
    public EmergencyChainOfResponsibility() {
        this.chain = new ArrayList<>();
        chain.add(new PoliceChainElement());
        chain.add(new FirefightersChainElement());
        chain.add(new AmbulanceChainElement());
    }

    public void invoke(int phoneNumber) {
        //szukamy ktora impleentacja obsluguje dany przypadek
        //iteratorem przechodzę przez łańcuch i szukam elementu,
        //ktory zgodzi sie obsłużyć żądanie (isMyResponsibility zwróci true)

        Iterator<ChainElement> iterator = chain.iterator();
        boolean flag = false;
        ChainElement chainElement = null;

        while (!flag && iterator.hasNext()) {
            ChainElement next = iterator.next();
            if (next.isMyResponsibility(phoneNumber)) {
                chainElement = next;
                flag = true;
            }
        }
        invoke(chainElement);   //wzbudzenie odpowiedniego elementu łańcucha (ten element może być nullem)
    }

    private void invoke(ChainElement chainElement) {
        if (chainElement != null) {
            chainElement.doAction();
        } else {
            //tutaj trafie, kiedy zaden z elementow nie zgodził sie obsłużyć zadania
            System.out.println("Nie udalo sie znalezc elementu odpowiedzialnego za wykonanie akcji");
        }
    }
}
