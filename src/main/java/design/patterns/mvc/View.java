package design.patterns.mvc;

/**
 * Created by mytek on 2017-06-21.
 */
public interface View<T> {
    String home(T model);
}
