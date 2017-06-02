package design.patterns.factory.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {
/*
        //tworzenie reczne - bez fabryki
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
        // tworzenie z pomoca fabryki
        AudiCarFactory audiCarFactory = new AudiCarFactory();
        Car car = audiCarFactory.buildCar("A3");
*/

        //trzecie podejscie - fabryka abstrakcyjna
        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("A3");
        Car car2 = abstractCarFactory.buildBMWCar("E3");
        Car car3 = abstractCarFactory.buildMercedesCar("W123");

    }
}
