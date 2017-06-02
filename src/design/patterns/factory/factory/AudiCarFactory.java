package design.patterns.factory.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class AudiCarFactory implements CarFactory {

    @Override
    public Car buildCar(String model) {
        Car car = null;

        if (model.equals("A3")) {
            Engine audiEngine = new Engine(200, 3000, "diesel");
            Wheels audiWheels = new Wheels(15, "summer");
            car = new Audi(audiEngine, audiWheels, "A3");
        } else if (model.equals("TT")) {
            Engine audiEngine = new Engine(150, 1500, "bena");
            Wheels audiWheels = new Wheels(19, "summer");
            car = new Audi(audiEngine, audiWheels, "TT");
        } else if (model.equals("S3")) {
            Engine audiEngine = new Engine(250, 3500, "diesel");
            Wheels audiWheels = new Wheels(21, "winter");
            car = new Audi(audiEngine, audiWheels, "S3");
        }
        return car;
    }
}
