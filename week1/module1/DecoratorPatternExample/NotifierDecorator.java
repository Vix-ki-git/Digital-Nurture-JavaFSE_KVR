public abstract class NotifierDecorator implements Notifier {
    protected Notifier n;
    public NotifierDecorator(Notifier n1) {
        this.n = n1;
    }
    public void send() {
        n.send();
    }
}