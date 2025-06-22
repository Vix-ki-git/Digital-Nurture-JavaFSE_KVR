public class Test {
    public static void main(String args[]) {
        UpiAdapter upi = new UpiAdapter();
        RazorPayAdapter rz = new RazorPayAdapter();

        upi.processPayment(1000);
        rz.processPayment(4000);
    }
}