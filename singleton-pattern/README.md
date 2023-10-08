Singleton
    - Đảm bảo một class chỉ có một thể hiện để truy suất mọi lúc, mọi nơi
    - Cung cập một điểm truy cập toàn cục ở mọi nơi và không thể ghi đè
      => vi phạm nguyên lý SINGPLE RESPONSIBILITY PRINCIPLE trong SOLID (phải chịu 2 trách nhiệm trên)

* Có nhiều cách cài đặt singleton pattern
    - eager initialization
    - lazy initialization (thích cách này hơn)
    - dùng với thread

* thứ tự thực hiện:
    - xác định private static instance
    - xác định private constructor (ngăn cản việc khởi tạo đối tượng bên ngoài class)
    - xác định mọt public static method (cho việc khởi tạo đối tượng từ bên ngoài)

* Ứng dụng:
    - khi class trong chương trình chỉ có một instance tới tất cả các đối tượng khác, ví dụ như connection database
        - ví dụ: https://www.javatpoint.com/singleton-design-pattern-in-java
    - hoặc logging, trong spring boot (đang áp dụng pattern này)

Ở đây mình triển khai lazy loading