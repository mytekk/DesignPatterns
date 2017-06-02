package design.patterns.chain;

/**
 * Created by RENT on 2017-06-02.
 */
public interface ChainElement {

    boolean isMyResponsibility(int phoneNumber);
    void doAction();

}
