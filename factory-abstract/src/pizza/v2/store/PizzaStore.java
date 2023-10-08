package pizza.v2.store;

import pizza.v2.product.Pizza;

/**
 * @author manhdt14
 * created in 10/8/2023 6:59 PM
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        // process for creating a pizza
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
