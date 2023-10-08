package pizza.v2.store;

import pizza.v2.product.Pizza;
import pizza.v2.product.newyork.NewYorkStyleCheesePizza;
import pizza.v2.product.newyork.NewYorkStyleGreekPizza;
import pizza.v2.product.newyork.NewYorkStylePepperoniPizza;

import java.util.Locale;

/**
 * @author manhdt14
 * created in 10/8/2023 6:57 PM
 */
public class NewYorkStylePizza extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase(Locale.ROOT)) {
            case "cheese" -> new NewYorkStyleCheesePizza();
            case "pepperoni" -> new NewYorkStylePepperoniPizza();
            case "greek" -> new NewYorkStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type!");
        };
    }
}
