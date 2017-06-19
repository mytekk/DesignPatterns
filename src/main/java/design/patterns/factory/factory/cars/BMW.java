package design.patterns.factory.factory.cars;

import design.patterns.factory.factory.car.components.Engine;
import design.patterns.factory.factory.car.components.Wheels;

/**
 * Created by RENT on 2017-06-02.
 *
 * klasa opisująca samochód BMW
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
