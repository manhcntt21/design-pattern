package pizza.v1.product;

/**
 * @author manhdt14
 * created in 10/8/2023 3:56 PM
 */
public abstract class Pizza {
    public String name;

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
