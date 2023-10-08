package pizza.v2;

import pizza.v2.product.Pizza;
import pizza.v2.store.CaliforniaPizzaStore;
import pizza.v2.store.ChicagoPizzaStore;
import pizza.v2.store.NewYorkStylePizza;
import pizza.v2.store.PizzaStore;

/**
 * @author manhdt14
 * created in 10/8/2023 6:58 PM
 */
public class PizzaDriven {
    public static void main(String[] args) {
        PizzaStore chicago = new ChicagoPizzaStore();
        PizzaStore cali = new CaliforniaPizzaStore();
        PizzaStore nv = new NewYorkStylePizza();

        Pizza johnPizza = chicago.orderPizza("cheese");
        Pizza davidPizza = cali.orderPizza("cheese");
        Pizza matheoPizza = nv.orderPizza("cheese");

        System.out.println(johnPizza.getName());
        System.out.println(davidPizza.getName());
        System.out.println(matheoPizza.getName());
    }
}
