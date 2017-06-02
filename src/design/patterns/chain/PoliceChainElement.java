package design.patterns.chain;

/**
 * Created by RENT on 2017-06-02.
 */
public class PoliceChainElement implements ChainElement {

    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 997;
    }

    @Override
    public void doAction() {
        System.out.println("Calling police");
    }
}
