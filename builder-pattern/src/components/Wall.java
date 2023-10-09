package components;

/**
 * @author manhdt14
 * created in 1/26/2023 6:42 PM
 */
public class Wall {
    public String name;
    public String material;

    public Wall(String material) {
        this.name = "Wall made out of " + material;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }
}
