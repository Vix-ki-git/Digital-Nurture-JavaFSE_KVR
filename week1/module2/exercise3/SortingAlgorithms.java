public class SortingAlgorithms {
    public static void bubbleSort(Order orders[]) {
        int n = orders.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(orders[j].totalPrice > orders[j+1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    }


    public static int partition(Order orders[], int low, int high) {

        double pivot = orders[high].totalPrice; //by the end all of the elements to the left of pivot must less than it and right of it must be greater than it.


        int i = low - 1; //index which will find true pivot position

        for(int j = low; j < high; j++) {
            if(orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[j];
                orders[j] = orders[i];
                orders[i] = temp;
            }
        }

            Order temp = orders[high];
            orders[high] = orders[i+1];
            orders[i+1] = temp;

            return i+1;
    }

    public static void quickSort(Order orders[], int low, int high) {
        if(low < high) {
            int partition_index = partition(orders, low, high);

            quickSort(orders, low, partition_index-1);
            quickSort(orders, partition_index+1, high);
        }
    }
}