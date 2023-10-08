package pizza.v3.store;

import pizza.v3.product.Pizza;
import pizza.v3.product.newyork.NewYorkStyleCheesePizza;
import pizza.v3.product.newyork.NewYorkStyleGreekPizza;
import pizza.v3.product.newyork.NewYorkStylePepperoniPizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:20 PM
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NewYorkStyleCheesePizza();
            case "pepperoni" -> new NewYorkStylePepperoniPizza();
            case "greek" -> new NewYorkStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}
