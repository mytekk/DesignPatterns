package design.patterns.chain;

/**
 * Created by RENT on 2017-06-02.
 *
 * interfejs, który mówi jakie warunki musi spełniać klasa, żeby mogłą być ogniwem, elementem łańcucha odpowiedzialności
 */
public interface ChainElement {

    boolean isMyResponsibility(int phoneNumber);    //sprawdzenie czy umiem/powinienem obsłużyć zdarzenia
    void doAction();    //właściwa obsługa zdarzenia

}
