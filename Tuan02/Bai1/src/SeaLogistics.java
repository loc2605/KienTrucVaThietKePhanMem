// Lớp SeaLogistics - concrete creator sản xuất Ship
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
