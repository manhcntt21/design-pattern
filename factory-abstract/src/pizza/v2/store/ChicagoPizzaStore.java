package pizza.v2.store;

import pizza.v2.product.Pizza;
import pizza.v2.product.chicago.ChicagoStyleCheesePizza;
import pizza.v2.product.chicago.ChicagoStyleGreekPizza;
import pizza.v2.product.chicago.ChicagoStylePepperoniPizza;

import java.util.Locale;

/**
 * @author manhdt14
 * created in 10/8/2023 6:53 PM
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase(Locale.ROOT)) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "greek" -> new ChicagoStyleGreekPizza();
            default -> throw new IllegalArgumentException("invalid type!");
        };
    }
}
