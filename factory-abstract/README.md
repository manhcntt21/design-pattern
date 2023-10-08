Thiết kế pizza shop

digram UML ở file factory-design-patter.draw.io

Các version thể hiện sự tiến hoá của hệ thống, nói chung factory abstract là sự nâng cao lên của factory method

### V1 
Khi chưa áp dụng design pattern, muốn thêm các loại pizza khác thì phải thay đổi orderPizza method trong PizzaStore Class, dẫn tới vi phạm nguyên tác open/close trong SOLID

Chúng ta tạo một class mới, định nghĩa phương thức order pizza và inject nó vào class Pizza Store, lúc này, trông có vẻ cái sự tạo pizza đã hơi lỏng lẻo một chút so với class PizzaStore, lúc này nếu có thay đổi thì cũng không thay đổi ở class PizzaStore nữa, các bạn sẽ hỏi là vậy thì lại chuyển sự thay đổi sang class SimplePizzaFactory, đúng? Theo nguyên lý S của SOLID, một class chỉ có một lí do để thay đổi, hoàn toàn hợp lý

### v2
Khi hệ thống phát triển hơn, cửa hàng của chúng ta không chỉ có một chi nhánh mà mở rộng hơn, sang thành phố khác chẳng hạn, các mặt hàng vẫn vậy nhưng chúng sẽ có một khác biệt vì nguyên liệu mỗi nơi một khác, quả cà chua ở Việt Nam sẽ không thể giống quả cà chua ở một nước châu Âu được.

**Đây chính là lúc chúng ta thấy sự xuất hiện của abstrack method, đó là lý do tại sao nó có tên là factory abstract**

Các bạn sẽ đặt câu hỏi: Vậy tại sao lại không dùng interface?, ok vẫn sẽ dùng được khí đó sẽ như sau:
`PizzaStore.class`
```java
public interface PizzaStore {
    default Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        // process for creating a pizza
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    Pizza createPizza(String type);
}
```
Không ghi thì access modifier là public, mặc định là abtract, từ java8, interface mới hỗ trợ phương thức có body, phải chỉ định là **default**, nhưng pattern có có từ rất lâu rồi, trong khi java8 - March 2014 [java 8 release date](https://www.codejava.net/java-se/java-se-versions-history)

Interface không hỗ trợ **protected** và **private**

Vì vậy mình sẽ chuyển về **abtract** cho theo chuẩn và vì cái tên nó nữa
Thử tạo các instance xem nào:
```java
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
```
and, kết quả:
```
...\design-pattern\out\production\factory-abstract pizza.v2.PizzaDriven
Chicago Style Cheese Pizza
California Style Cheese Pizza
NewYork Style Cheese Pizza

Process finished with exit code 0
```
Một điều quan trọng các bạn nên nhớ là tại abstract class PizzaStore, orderPizza() không hề biết loại Pizza nào thực sự được gọi, hành vị này gọi là **decoupled**, vậy cái gì quyết định, đó chính là subclass quyết định trong runtime dựa theo người dùng chọn khu vực nào