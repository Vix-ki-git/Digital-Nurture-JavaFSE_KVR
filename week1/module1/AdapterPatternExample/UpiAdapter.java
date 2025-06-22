
public class UpiAdapter implements PaymentProcessor {
    private UpiGateway upi = new UpiGateway();

    public void processPayment(double amount) {
        upi.upiPayment(amount);
    }
}