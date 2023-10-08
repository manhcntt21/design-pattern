package pizza.v3;

import pizza.v3.product.Pizza;
import pizza.v3.store.CaliforniaPizzaStore;
import pizza.v3.store.ChicagoPizzaStore;
import pizza.v3.store.NYPizzaStore;
import pizza.v3.store.PizzaStore;

/**
 * @author manhdt14
 * created in 9/26/2023 10:57 PM
 */
public class PizzaDriver {
    public static void main(String[] args) {
        PizzaStore joel = new ChicagoPizzaStore();
        PizzaStore ethan = new NYPizzaStore();
        PizzaStore me = new CaliforniaPizzaStore();

        Pizza joelPizza = joel.orderPizza("cheese");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        Pizza ethanPizza = ethan.orderPizza("cheese");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        Pizza mePizza = me.orderPizza("cheese");
    }
}
