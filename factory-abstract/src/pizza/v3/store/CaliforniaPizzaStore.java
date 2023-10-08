package pizza.v3.store;

import pizza.v3.product.Pizza;
import pizza.v3.product.california.CaliforniaStyleCheesePizza;
import pizza.v3.product.california.CaliforniaStyleGreekPizza;
import pizza.v3.product.california.CaliforniaStylePepperoniPizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:21 PM
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            case "greek" -> new CaliforniaStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}
