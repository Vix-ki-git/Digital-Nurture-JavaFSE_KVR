public class Main {

    public static void main(String args[]) {
        Order orders[] = {
            new Order(1, "water bottle", 20),
            new Order(2, "pen", 10),
            new Order(50, "chicken", 210),
            new Order(12, "chips", 35),
            new Order(3, "kurekure", 25)
        };

        System.out.println("Before Sorting: ");
        for(int i = 0; i < orders.length; i++) 
            System.out.println(orders[i].totalPrice);
        
        Order qsOrders[] = orders.clone();
        SortingAlgorithms.quickSort(qsOrders, 0, qsOrders.length-1);
        System.out.println("After quick sorting: ");
        for(int i = 0; i < qsOrders.length; i++) 
            System.out.println(qsOrders[i].totalPrice);

        Order bsOrders[] = orders.clone();
        SortingAlgorithms.bubbleSort(bsOrders);
        System.out.println("After Bubble sorting: ");
        for(int i = 0; i < bsOrders.length; i++) 
            System.out.println(bsOrders[i].totalPrice);

    }

    
}