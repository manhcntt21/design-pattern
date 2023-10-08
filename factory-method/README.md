Factory method:

- là desgin pattern về khởi tạo

- dung interface hoặc abstract class để khởi tạo đối tượng, và cho phép subclass quyết định class nào được khởi tạo

- interface như là một data type, khởi tạo nhiều thể hiện của các class mà implement nó, khi đó nó không dùng trực tiếp
  được các phương thức viết thêm ở class implement mà phải ép kiểu về từng loại cụ thể để dùng các phương thức tương ưng

- dễ dàng mở rộng, độc lập với phần còn lại của mã

ứng dụng:

- khi không biết chính xác loại đối tượng và sự phụ thuộc của đối tượng

Thứ tự thực hiện

- Tạo các Product follow theo cùng một interface
- Xác định một factory có chưa một phương thức khởi tạo trả về một interface, xác định các đối tượng nào được khởi tạo theo tham số
    - đóng gói phương thức khởi tạo vào một class
    - chỉ có một nơi để chỉnh sửa khi thay đổi
- Xác định một service, khởi tạo  factory đã tạo ở trên và gọi phương thức khởi tạo với tham số tương ứng với đối tượng con muốn khởi tạo