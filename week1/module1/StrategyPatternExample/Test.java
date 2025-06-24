public class Test {
    public static void main(String args[]) {
        PaymentStrategy s1 = new CreditCardPayment();
        PaymentStrategy s2 = new PayPalPayment();

        PaymentContext context = new PaymentContext();

        context.setStrategy(s1);
        context.executePayment(1000);
        context.executePayment(121.11);
        context.setStrategy(s2);
        context.executePayment(2000);
    }
}