// Lớp InteriorDesigner - Client
public class InteriorDesigner {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public InteriorDesigner(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void decorateRoom() {
        System.out.println("\n--- Trang trí phòng khách ---");
        chair.sitOn();
        sofa.lieXuong();
        coffeeTable.datTrangTri();
    }
}
