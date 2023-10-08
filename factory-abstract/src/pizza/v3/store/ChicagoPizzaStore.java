package pizza.v3.store;

import pizza.v3.product.Pizza;
import pizza.v3.product.chicago.ChicagoStyleCheesePizza;
import pizza.v3.product.chicago.ChicagoStyleGreekPizza;
import pizza.v3.product.chicago.ChicagoStylePepperoniPizza;

/**
 * @author manhdt14
 * created in 9/26/2023 10:20 PM
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "greek" -> new ChicagoStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type");
        };
    }
}
