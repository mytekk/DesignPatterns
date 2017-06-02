package design.patterns.chain;

/**
 * Created by RENT on 2017-06-02.
 */
public class AmbulanceChainElement implements ChainElement {

    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 999;
    }

    @Override
    public void doAction() {
        System.out.println("Calling Ambulance");
    }
}
