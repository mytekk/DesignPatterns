package design.patterns.factory.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BMWCarFactory implements CarFactory {

    @Override
    public Car buildCar(String model) {
        Car car = null;

        if (model.equals("E3")) {
            Engine bmwEngine = new Engine(80, 1500, "diesel");
            Wheels bmwWheels = new Wheels(15, "winter");
            car = new BMW(bmwEngine, bmwWheels, "E3");
        } else if (model.equals("M5")) {
            Engine bmwEngine = new Engine(120, 1800, "bena");
            Wheels bmwWheels = new Wheels(15, "summer");
            car = new BMW(bmwEngine, bmwWheels, "M5");
        } else if (model.equals("X3")) {
            Engine bmwEngine = new Engine(150, 2500, "diesel");
            Wheels bmwWheels = new Wheels(15, "summer");
            car = new BMW(bmwEngine, bmwWheels, "X3");
        }

        return car;
    }
}
