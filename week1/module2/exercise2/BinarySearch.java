public class BinarySearch {
    public static int search(Product products[], int pid) {
        int l = 0;
        int r = products.length - 1;

        while(l <= r) {
            int mid = l + (r-l)/2;
            if(products[mid].productId == pid) 
                return mid;
            else if(products[mid].productId < pid) 
                l = mid + 1;
            else    
                r = mid - 1; 
        }
        
        return -1;
    }
}