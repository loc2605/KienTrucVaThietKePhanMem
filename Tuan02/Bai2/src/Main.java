// Lớp Main - Demo Abstract Factory Pattern
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Pattern Demo ===");
        System.out.println("=== Furniture Shop ===");

        // Client chọn phong cách Modern
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        InteriorDesigner modernDesigner = new InteriorDesigner(modernFactory);
        modernDesigner.decorateRoom();

        // Client chọn phong cách Victorian
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        InteriorDesigner victorianDesigner = new InteriorDesigner(victorianFactory);
        victorianDesigner.decorateRoom();
    }
}
