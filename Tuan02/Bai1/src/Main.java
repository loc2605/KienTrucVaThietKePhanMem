// Lớp Main - Client code
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern Demo ===\n");
        
        // Client chọn RoadLogistics
        System.out.println("1. Chọn RoadLogistics:");
        Logistics log = new RoadLogistics();
        log.planDelivery();
        
        System.out.println("\n2. Chọn SeaLogistics:");
        // Client chọn SeaLogistics
        log = new SeaLogistics();
        log.planDelivery();
    }
}
