public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Doing Credit Card Payment for amount: "+amount+"/- \n");
    }
}