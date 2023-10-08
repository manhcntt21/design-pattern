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
    Pizza orderPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("greek")) {
            pizza = new GreekPizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else {
            throw new IllegalArgumentException();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();
        Pizza cheese = ps.orderPizza("cheese");
        System.out.println(cheese.toString());

        Pizza greek = ps.orderPizza("greek");
        System.out.println(greek.toString());
    }
}
