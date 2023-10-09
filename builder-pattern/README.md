Buider Pattern: là một pattern trong nhóm khởi tạo, nó giải quyết vấn đề của Factory pattern và Abstract factory pattern khí có nhiều
tham số.

### Nó giải quyết vấn đề:
- quá có nhiều tham số của một class mà phía cần client phải quan tâm, cũng như các kiểu giá trị của chúng, có tham số
  yêu cầu kiểu enum (danh sách), ... để truyền đến factory class
- một số tham số là tuỳ chọn trong factory pattern chúng ta phải gửi tất cả các tham số, với tham số tuỵ chọn nếu không
    nhập giá trị thì sẽ là null
- nếu một object có nhiều thuộc tính => phực tạp trong quá trình khởi tạo

=> builder pattern làm cho việc đó trở nên đơn giản

ví dụ về House: 
1. Bắt đầu từ House Class, định nghĩa ra các thành phần cơ bản của một ngồi nhà
    1. roof
    2. wall
    3. windows
    4. house type: wood, clay, stone,...
2. abstract class HouseBuilder: khai báo các bước xây dựng sản phẩm chung cho tất cả các loại hình xây dụng,
   các phương thức này đều trả về HouseBuilder, ngoại từ build method
    1. addWalls
    2. addRoof
    3. addWindows
    4. setHouseType
    5. build method (trả về House)
3. Với mỗi kiểu nhà sẽ có cách thức triển khai và nguyên liệu dùng riêng, các phương thức đều trả về this
   Với nhà bằng gỗ
    1. mái nhà cần số lượng gỗ như thế nào (addRoof)
    2. tường nhà cần các mảnh gỗ ra làm sao (addWalls)
    3. cửa sổ thế nào
4. ghép chúng với nhau bằng phương thức build

Ví dụ: chúng ta có thể khởi tạo đối tượng bằng chain operation như sau:
```java
public class HouseDirector {
    public static void main(String[] args) {
        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(woodHouse);
    }
}
```