package design.patterns.factory.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-02.
 */
public class AbstractCarFactory {

    private Map<CarFactoriesEnums, CarFactory> factories;

    public AbstractCarFactory() {
        this.factories = new HashMap<>();
        initFactories();
    }

    public Car buildAudiCar(String model) {
        return buildCar(CarFactoriesEnums.AUDI, model);
    }

    public Car buildBMWCar(String model) {
        return buildCar(CarFactoriesEnums.BMW, model);
    }

    public Car buildMercedesCar(String model) {
        return buildCar(CarFactoriesEnums.MERCEDES, model);
    }

    private void initFactories() {
        factories.put(CarFactoriesEnums.AUDI, new AudiCarFactory());
        factories.put(CarFactoriesEnums.BMW, new BMWCarFactory());
        factories.put(CarFactoriesEnums.MERCEDES, new MercedesCarFactory());
    }

    private Car buildCar(CarFactoriesEnums type, String model) {
        return factories.get(type).buildCar(model);
    }
}
