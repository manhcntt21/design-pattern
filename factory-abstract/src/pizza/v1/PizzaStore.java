package pizza.v1;


import pizza.v1.product.CheesePizza;
import pizza.v1.product.GreekPizza;
import pizza.v1.product.PepperoniPizza;
import pizza.v1.product.Pizza;

/**
 * @author manhdt14
 * created in 10/8/2023 3:59 PM
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.factory = simplePizzaFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
        Pizza cheese = ps.orderPizza("cheese");
        System.out.println(cheese.toString());

        Pizza greek = ps.orderPizza("greek");
        System.out.println(greek.toString());
    }
}
