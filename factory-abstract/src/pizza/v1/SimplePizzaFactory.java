package pizza.v1;

import pizza.v1.product.CheesePizza;
import pizza.v1.product.GreekPizza;
import pizza.v1.product.PepperoniPizza;
import pizza.v1.product.Pizza;

/**
 * @author manhdt14
 * created in 10/8/2023 4:08 PM
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("greek")) {
            pizza = new GreekPizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("invalid type!");
        }
        return pizza;
    }
}
