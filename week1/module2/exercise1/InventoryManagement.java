import java.util.HashMap;
import java.util.Map;

public class InventoryManagement{
        private Map<Integer, Product> inventory;

        public InventoryManagement() {
            inventory = new HashMap<>();
        }

        public void add(Product product) {
            inventory.put(product.productId, product);
            System.out.println("Product: "+product+" added.");
        }

        public void update(int pid, int quantity, double price) {
            Product product = inventory.get(pid);
            if(product != null) {
                product.quantity = quantity;
                product.price = price;
                System.out.println("Product: "+product+" updated.");
            } else {
                System.out.println("Product not present.");
            }
        }

        public void delete(int pid) {
            Product product = inventory.get(pid);
            if(product != null) {
                System.out.println("Product: "+product+" deleted.");
                inventory.remove(pid);
            } else {
                System.out.println("Product not present.");
            }
        }


}







