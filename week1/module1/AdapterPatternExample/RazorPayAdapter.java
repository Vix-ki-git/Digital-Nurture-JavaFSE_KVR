public class RazorPayAdapter implements PaymentProcessor {
    private RazorPayGateway rz = new RazorPayGateway();

    public void processPayment(double amount) {
        rz.razorPayment(amount);
    }
}