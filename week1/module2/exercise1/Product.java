public class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int pid, String pname, int quantity, double price) {
        this.productId = pid;
        this.productName = pname;
        this.quantity = quantity;
        this.price = price;
    }
}