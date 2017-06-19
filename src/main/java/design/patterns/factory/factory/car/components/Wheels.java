package design.patterns.factory.factory.car.components;

/**
 * Created by RENT on 2017-06-02.
 *
 * klasa opisująca koła w samochodzie
 */
public class Wheels {

    private int size;
    private String type;

    public Wheels(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "4 Wheels{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}