// Lớp Ship cài đặt giao diện Transport
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Giao hàng bằng tàu thuyền trên biển");
    }
}
