public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier n) {
        super(n);
    }
    public void send() {
        super.send();
        System.out.print("--From SMS\n");
    }
}