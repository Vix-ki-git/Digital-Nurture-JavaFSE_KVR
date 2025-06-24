public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier n) {
        super(n);
    }
    public void send() {
        super.send();
        System.out.println("--From Slack\n");
    }
}