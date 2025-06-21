public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[]{
            new Product(1, "notebook", "Education"),
            new Product(2, "pen", "Education"),
            new Product(3, "laptop", "Electronics"),
            new Product(4, "shirt", "Fashion"),
            new Product(5, "shoes", "Fashion"),
            new Product(6, "mouse", "Electronics" )
        };

        int id1 = 2;

        int lid = LinearSearch.search(products, id1);
        if (lid != -1) {
            System.out.println("Linear Search Product Found");
        } else {
            System.out.println("Linear Search Product Not Found");
        }

        int id2 = 7;

        int bid = BinarySearch.search(products, id2);
        if (bid != -1) {
            System.out.println("Binary Search Product Found");
        } else {
            System.out.println("Binary Search Product Not Found");
        }
    }
}
