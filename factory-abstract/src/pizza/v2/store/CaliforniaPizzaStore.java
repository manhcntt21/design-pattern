package pizza.v2.store;

import pizza.v2.product.Pizza;
import pizza.v2.product.california.CaliforniaStyleCheesePizza;
import pizza.v2.product.california.CaliforniaStyleGreekPizza;
import pizza.v2.product.california.CaliforniaStylePepperoniPizza;

import java.util.Locale;

/**
 * @author manhdt14
 * created in 10/8/2023 6:57 PM
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase(Locale.ROOT)) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            case "greek" -> new CaliforniaStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type!");
        };
    }
}
