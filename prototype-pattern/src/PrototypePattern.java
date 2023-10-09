import newoperator.PineTree;
import newoperator.PlasticTree;
import newoperator.Position;

/**
 * @author manhdt14
 * created in 10/9/2023 8:06 AM
 */
public class PrototypePattern {
    public static void main(String[] args) {
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
}
