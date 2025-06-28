public class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int oi, String cn, double tp) {
        this.orderId = oi;
        this.customerName = cn;
        this.totalPrice = tp;
    }
}