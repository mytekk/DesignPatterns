package design.patterns.factory.factory;

import design.patterns.factory.factory.cars.Car;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {
/*
        // PIERWSZY WARIANT - tworzenie reczne - bez fabryki

        Engine audiEngine = new Engine(200, 3000, "diesel");
        Wheels audiWheels = new Wheels(15, "summer");
        Audi audi = new Audi(audiEngine, audiWheels, "A3");

        audi.drive();

        Engine mercedesEngine = new Engine(200, 3000, "diesel");
        Wheels mercedesWheels = new Wheels(15, "summer");
        Mercedes mercedes = new Mercedes(mercedesEngine, mercedesWheels, "S600");

        mercedes.drive();

        Engine bmwEngine = new Engine(200, 3000, "diesel");
        Wheels bmwWheels = new Wheels(15, "summer");
        BMW bmw = new BMW(bmwEngine, bmwWheels, "E3");

        bmw.drive();
*/

/*
        // DRUGI WARIANT - tworzenie z pomoca fabryki (podajemy nazwę modelu i fabrykę danej marki samochodów) - czyli muszę wiedzieć jaka fabryka umie stworzyć mój nowy model
        AudiCarFactory audiCarFactory = new AudiCarFactory();
        Car car = audiCarFactory.buildCar("A3");
*/

        //TRZECI WARIANT - fabryka abstrakcyjna - tutaj nawet nie muszę wiedzieć jaka konkretna fabryka umie stowrzyć mój model, bo
        //fabryka abstrakcyjna sama ma metody, które odpalą odpowiednią fabrykę. Sam muszę jedynie podać model i wybrać metodę
        //budującą dany typ auta
        AbstractCarFactory myAbstractCarFactory = new AbstractCarFactory();
        Car car = myAbstractCarFactory.buildAudiCar("A3");
        Car car2 = myAbstractCarFactory.buildBMWCar("E3");
        Car car3 = myAbstractCarFactory.buildMercedesCar("W123");

    }
}
