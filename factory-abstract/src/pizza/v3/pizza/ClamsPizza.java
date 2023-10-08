package pizza.v3.pizza;

import pizza.v3.factory.PizzaIngredientFactory;

/**
 * @author manhdt14
 * created in 9/27/2023 1:04 AM
 */
public class ClamsPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamsPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("NAME: " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClams();
    }
}
