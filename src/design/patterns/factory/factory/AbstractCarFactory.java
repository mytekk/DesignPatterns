package design.patterns.factory.factory;

import design.patterns.factory.factory.cars.Car;
import design.patterns.factory.factory.factories.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-02.
 *
 * fabryka abstrakcyjna
 */
public class AbstractCarFactory {

    private Map<CarFactoriesEnums, CarFactory> factories; //mapa zawierająca pary: marka_samochodu + obiekt_fabryki_tworzącej_auta_danej_marki

    //konstruktor
    public AbstractCarFactory() {
        //inicjalizuje mapę pustą HashMapą i wypełniam ją danymi
        this.factories = new HashMap<>();
        initFactories();
    }

    private void initFactories() {
        //dodawanie fabryk do mapy
        factories.put(CarFactoriesEnums.AUDI, new AudiCarFactory());
        factories.put(CarFactoriesEnums.BMW, new BMWCarFactory());
        factories.put(CarFactoriesEnums.MERCEDES, new MercedesCarFactory());
    }

    //prywatna metoda tworząca obiekt typu Car za pomocą odpowiedniej fabryki
    //jako argumenty przekazujemy: nazwę modelu od usera
    //oraz ENUM. Na podstawie tego enuma (zmienna type) wyciągam z mapy fabryk (factories) metodą get odpowiednią
    //fabrykę i na tej fabryce odpalam jej metodę buildCar, która stworzy Car w zależności od podanego modelu
    private Car buildCar(CarFactoriesEnums type, String model) {
        CarFactory properCarFactory = factories.get(type);
        return properCarFactory.buildCar(model);
    }

    //definicja publicznych metod, które będą tworzyły obiekty danych klas
    //wewnątrz wywołuję prywatną metodę buildCar z tej klasy
    //i jako argumenty przekazuję nazwę modelu od usera oraz
    //odpowiedni ENUM, który pozwoli później wskazać konkretną fabrykę
    public Car buildAudiCar(String model) { return buildCar(CarFactoriesEnums.AUDI, model); }

    public Car buildBMWCar(String model) { return buildCar(CarFactoriesEnums.BMW, model); }

    public Car buildMercedesCar(String model) {
        return buildCar(CarFactoriesEnums.MERCEDES, model);
    }
}
