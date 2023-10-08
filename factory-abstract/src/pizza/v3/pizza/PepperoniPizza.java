package pizza.v3.pizza;

import pizza.v3.factory.PizzaIngredientFactory;

/**
 * @author manhdt14
 * created in 9/27/2023 1:04 AM
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {

    }
}
