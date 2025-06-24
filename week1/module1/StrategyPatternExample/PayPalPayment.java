public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Doing PayPal Payment of amount: "+amount+"/- \n");
    } 
}