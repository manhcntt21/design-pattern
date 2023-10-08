package pizza.v3.pizza;

import pizza.v3.ingredient.*;

import java.util.ArrayList;

/**
 * @author manhdt14
 * created in 9/26/2023 4:26 PM
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Pepperoni pepperoni;
    protected Clams clam;
    protected Cheese cheese;
    protected ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("BAKE: bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("CUT: cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("BOX: place pizza in official in PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
