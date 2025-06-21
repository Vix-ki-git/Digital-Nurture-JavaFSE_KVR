public class LinearSearch {
    public static int search(Product products[], int pid) {
        for(int i = 0; i < products.length; i++) {
            if(products[i].productId == pid)
                return i;
        }

        return -1;
    }
}