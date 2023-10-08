Thiết kế pizza shop

digram UML ở file factory-design-patter.draw.io

Các version thể hiện sự tiến hoá của hệ thống, nói chung factory abstract là sự nâng cao lên của factory method

V1: khi chưa áp dụng design pattern, muốn thêm các loại pizza khác thì phải thay đổi orderPizza method trong PizzaStore Class, dẫn tới vi phạm nguyên tác open/close trong SOLID

Chúng ta tạo một class mới, định nghĩa phương thức order pizza và inject nó vào class Pizza Store, lúc này, trông có vẻ cái sự tạo pizza đã hơi lỏng lẻo một chút so với class PizzaStore, lúc này nếu có thay đổi thì cũng không thay đổi ở class PizzaStore nữa, các bạn sẽ hỏi là vậy thì lại chuyển sự thay đổi sang class SimplePizzaFactory, đúng? Theo nguyên lý S của SOLID, một class chỉ có một lí do để thay đổi, hoàn toàn hợp lý