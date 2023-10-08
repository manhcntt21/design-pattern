package pizza.v3.factory;

import pizza.v3.ingredient.*;

/**
 * @author manhdt14
 * created in 9/27/2023 12:31 AM
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
