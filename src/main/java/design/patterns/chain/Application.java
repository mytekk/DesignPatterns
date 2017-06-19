package design.patterns.chain;

/**
 * Created by RENT on 2017-06-02.
 *
 * główna klasa programu
 */
public class Application {
    public static void main(String[] args) {
        //tworzę obiekt łańcucha i dla testów zadaje mu kilka wartości do obsłużenia
        EmergencyChainOfResponsibility emergencyChain = new EmergencyChainOfResponsibility();

        emergencyChain.invoke(998);
        emergencyChain.invoke(999);
        emergencyChain.invoke(997);
        emergencyChain.invoke(998678);
    }
}
