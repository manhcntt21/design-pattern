package pizza.v3.factory;

import pizza.v3.ingredient.*;
import pizza.v3.ingredient.cheese.ReggianoCheese;
import pizza.v3.ingredient.clam.FreshClams;
import pizza.v3.ingredient.dough.ThinCrustDough;
import pizza.v3.ingredient.pepperoni.SlicedPepperoni;
import pizza.v3.ingredient.sauce.MarinaraSauce;
import pizza.v3.ingredient.veggie.Garlic;
import pizza.v3.ingredient.veggie.Mushroom;
import pizza.v3.ingredient.veggie.Onion;
import pizza.v3.ingredient.veggie.RedPepper;

/**
 * @author manhdt14
 * created in 9/27/2023 12:38 AM
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
