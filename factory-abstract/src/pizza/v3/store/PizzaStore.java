package pizza.v3.store;

import pizza.v3.product.Pizza;

/**
 * @author manhdt14
 * created in 9/26/2023 4:44 PM
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
