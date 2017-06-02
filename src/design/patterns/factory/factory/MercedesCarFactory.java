package design.patterns.factory.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class MercedesCarFactory implements CarFactory {
    @Override
    public Car buildCar(String model) {
        Car car = null;

        if (model.equals("S600")) {
            Engine mercedesEngine = new Engine(220, 2000, "diesel");
            Wheels mercedesWheels = new Wheels(17, "winter");
            car = new Mercedes(mercedesEngine, mercedesWheels, "S600");
        } else if (model.equals("W123")) {
            Engine mercedesEngine = new Engine(95, 1900, "diesel");
            Wheels mercedesWheels = new Wheels(18, "summer");
            car = new Mercedes(mercedesEngine, mercedesWheels, "W123");
        } else if (model.equals("SLK-500")) {
            Engine mercedesEngine = new Engine(90, 2200, "diesel");
            Wheels mercedesWheels = new Wheels(19, "summer");
            car = new Mercedes(mercedesEngine, mercedesWheels, "SLK-500");
        }
        return car;
    }
}
