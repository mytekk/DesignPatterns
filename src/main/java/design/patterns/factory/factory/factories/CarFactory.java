package design.patterns.factory.factory.factories;

import design.patterns.factory.factory.cars.Car;

/**
 * Created by RENT on 2017-06-02.
 *
 * interfejs definiujący jak powinna wyglądać fabryka samochodów
 * każda fabryka musi mieć metodę buildCar, która zwróci obiekt typu Car
 * Car jest interfejsem, więc efektywnie będzie to obiekt typy AUdi, Mercedes albo BMW
 * bo te klasy implementują interfejs Car
 * Metoda jako argument przyjmuje stringa z nazwą modelu  samochodu danej marki
 */
public interface CarFactory {
    Car buildCar(String model);
}
