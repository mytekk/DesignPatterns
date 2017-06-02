package design.patterns.chain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by RENT on 2017-06-02.
 */
public class EmergencyChain {

    private List<ChainElement> chain;

    public EmergencyChain() {
        this.chain = new ArrayList<>();
        chain.add(new PoliceChainElement());
        chain.add(new FirefightersChainElement());
        chain.add(new AmbulanceChainElement());
    }

    public void invoke(int phoneNumber) {
        //szukamy ktora impleentacja obsluguje dany przypadek

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
        invoke(chainElement);
    }

    private void invoke(ChainElement chainElement) {
        if (chainElement != null) {
            chainElement.doAction();
        } else {
            System.out.println("Nie udalo sie znalezc elementu odpowiedzialnego za wykonanie akcji");
        }
    }
}
