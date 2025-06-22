public class Main {
    public static void main(String args[]) {
        Product p1 = new Product(1, "Apple Phone", 4, 50000);
        Product p2 = new Product(2, "Shoes", 3, 1000);
        Product p3 = new Product(3, "Cup", 10, 100);

        InventoryManagement ims = new InventoryManagement();

        ims.add(p1);
        ims.add(p2);
        ims.add(p3);

        ims.update(1, 3, 55000);
        ims.delete(3);
    }
}