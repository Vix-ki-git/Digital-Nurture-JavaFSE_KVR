public class PaymentContext {
    private PaymentStrategy method;

    public void setStrategy(PaymentStrategy ps) {
        this.method = ps;
    }

    public void executePayment(double amount) {
        if(method == null) {
            System.out.println("Please set the strategy first before execution.");
        } else {
            method.pay(amount);
        }
        
    }
}