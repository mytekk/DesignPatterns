package design.patterns.factory.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BMW implements Car {

    private Engine engine;
    private Wheels wheels;
    private String model;

    public BMW(Engine engine, Wheels wheels, String model) {
        this.engine = engine;
        this.wheels = wheels;
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving with BMW " + model);
        System.out.println("Engine: " + engine.toString());
        System.out.println("Wheels: " + wheels.toString());
    }
}
