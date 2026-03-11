// Lớp trừu tượng Logistics định nghĩa factory method
public abstract class Logistics {
    // Abstract factory method - các lớp con sẽ cài đặt
    public abstract Transport createTransport();
    
    // Phương thức planDelivery sử dụng factory method
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}
