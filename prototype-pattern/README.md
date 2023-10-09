Nhiệm vụ của nó là khởi tạo một đối tượng bằng cách clone một đối tượng đã tồn tại thay vì khởi tạo với new keywork,
đối tượng mới là một bản sao có thể giống 100% với đối tượng gốc, chúng ta có thể thay đổi nó mà không ảnh hưởng tói đối
tượng ban đầu

Prototype pattern cho phép chúng ta tạo ra một bản sao của một đối tượng mà không phụ thuộc vào lớp implement cụ thể
Gồm 3 thành phần:
1. Prototype
2. ConcretePrototype
3. Client

Có 2 cách để triển khai Prototype Pattern
1. implement Cloneable interface
2. use new operator: https://www.baeldung.com/java-pattern-prototype

### Sử dụng với toán tử new

Chúng ta có hai loại đối tượng PineTree Với PlasticTree

Khởi tạo một instance plasticTree của PlasticTree và anotherPlasticTree nhận từ phương thức copy, chúng ta sẽ thấy chúng có hashcode khác nhau, nghĩa là chúng là các đối tượng khác nhau
```java
public class PrototypePattern {
    public static void main(String[] args) {
        double mass = 10.0;
        double height = 3.7;

        Position p1 = new Position(3,7);
        PlasticTree plasticTree = new PlasticTree(mass, height);

        System.out.println(plasticTree.hashCode());
        Position p2 = new Position(7, 3);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        System.out.println(anotherPlasticTree.hashCode());
    }
}
```
Bây giờ nếu chúng ta thay đổi giá trị `mass` hoặc `height` của `plasticTree` nó sẽ không ảnh hưởng gì đến giá trị của `anotherPlascticTree`

```java
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }
```

Tuy nhiên nếu thay đổi giá trị của position p1 thì nó sẽ thay đổi trên cả 2 đối tượng và phương pháp triển khai copy này gọi là `shallow copy`, mặc dù 2 biến tree này là khác nhau, những nó đều trỏ đến ô nhớ chứa giá trị p1. Hai câu lệnh dưới đây có cùng giá trị
```java
        System.out.println(plasticTree.getPosition());
        System.out.println(anotherPlasticTree.getPosition());
```

Vì vậy để được copy hoàn toàn, ta phải gán lại position cho nó, khi đó ta đặt được sự copy toàn diện, giá trị hashcode của object trên trong đã được tạo một cái mới.
```java
        anotherPlasticTree.setPosition(p2);
        System.out.println(plasticTree.getPosition());
        System.out.println(anotherPlasticTree.getPosition());
```