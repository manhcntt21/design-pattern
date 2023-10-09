package components;

/**
 * @author manhdt14
 * created in 1/26/2023 6:42 PM
 */
public class Window {
    public String name;
    public String material;

    public Window(String material) {
        this.name = "Window made out of " + material;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }
}
