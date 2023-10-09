import cloneableinterface.Tree;
import newoperator.PlasticTree;
import newoperator.Position;

/**
 * @author manhdt14
 * created in 10/9/2023 8:06 AM
 */
public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
//        case1();
//        case2();
        case3();
    }

    public static void case1() {
        double mass = 10.0;
        double newMass = 20.0;
        double height = 3.7;

        Position p1 = new Position(3,7);
        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(p1);

        System.out.println(plasticTree.hashCode());
        Position p2 = new Position(7, 3);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();

        System.out.println(anotherPlasticTree.hashCode());
        System.out.println();
        // flase, chúng là các đối tượng khác nahu
        System.out.println(plasticTree.equals(anotherPlasticTree)); // false
        // thay đổi giá trị mass hoặc height của plasticTree
        plasticTree.setMass(newMass);
        // kiểm tra xem anotherPlasticTree có thay đổi không
        System.out.println(anotherPlasticTree.getMass()); // 10, vẫn giữ nguyên
        System.out.println();
        // shallow copy
        System.out.println(plasticTree.getPosition().hashCode());
        System.out.println(anotherPlasticTree.getPosition().hashCode());
        System.out.println();
        // deep.copy
        anotherPlasticTree.setPosition(p2);
        System.out.println(plasticTree.getPosition());
        System.out.println(anotherPlasticTree.getPosition());
    }
    public static void case2() throws CloneNotSupportedException {
        double mass = 10.0;
        double height = 3.7;
        cloneableinterface.Position position = new cloneableinterface.Position(3, 7);
        cloneableinterface.Position otherPosition = new cloneableinterface.Position(7, 3);
        Tree t = new Tree(mass, height);
        t.setPosition(position);
        Tree t2 = (Tree) t.clone();
        System.out.println();
        System.out.println(t.hashCode() == t2.hashCode()); // false
        System.out.println();
        position.setX(10);
        System.out.println(t.getPosition());
        System.out.println(t2.getPosition());

    }
    public static void case3() throws CloneNotSupportedException {
        double mass = 10.0;
        double height = 3.7;
        cloneableinterface.Position position = new cloneableinterface.Position(3, 7);
        cloneableinterface.Position otherPosition = new cloneableinterface.Position(7, 3);
        Tree t = new Tree(mass, height);
        t.setPosition(position);
        Tree t2 = (Tree) t.clone();
        System.out.println(t.hashCode());
        System.out.println(t2.hashCode());
        System.out.println();
        position.setX(10);
        System.out.println(t.getPosition());
        System.out.println(t2.getPosition());
    }
}
