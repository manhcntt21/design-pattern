package cloneableinterface;

/**
 * @author manhdt14
 * created in 10/9/2023 12:58 PM
 */
public class Tree implements Cloneable {
    private double mass;
    private double height;
    private Position position;

    public Tree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getMass() {
        return mass;
    }

    public double getHeight() {
        return height;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Tree [mass=" + mass + ", height=" + height + ", position=" + position + "]";
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Tree clone = (Tree) super.clone();
        clone.setPosition(new Position(clone.getPosition().getX(), clone.getPosition().getY()));
        return clone;
    }
}
