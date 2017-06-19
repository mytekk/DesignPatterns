package design.patterns.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;

/**
 * Created by mytek on 2017-06-14.
 *
 * Biblioteka LOMBOK - biblioteka do automatycznego generowania getterów, setterów oraz innych
 * automatycznie generowanych fragmentó kodu
 * robi to za pomocą odpowiednich adnotacji
 *
 * @Data - generuje gettery, settery, metodę equals i hashCode i toString oraz konstruktor z wszystkimi
 * wymaganymi polami
 *
 * @Builder - implementuje wzorzec projektowy Builder. Dzięki tej adnotacji
 * kompilator wygeneruje statyczną zagniezdzoną klasę buildera oraz niezbędny
 * konstruktor w głównej klasie
 *
 * @AllArgsConstructor - generuje konstruktor z listą parametrów tożsamą z listą pól w klasie
 *
 * UWAGA - dzięki temu działąnie programu w tej paczce (package lombok) jest IDENTYCZNE z tym co
 * jest w paczce builder (package builder) - a nie trzeba było pisać tego wszystkiego ręcznie !!!
 *
 * http://kobietydokodu.pl/praktyczna-java-lombok-boilerplate-generator/
 * https://projectlombok.org/features/all
 */


@Data
@Builder
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String zipCode;

}


