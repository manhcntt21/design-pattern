package pizza.v3.product;

/**
 * @author manhdt14
 * created in 10/8/2023 3:56 PM
 */
public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
