public class Main {
    public static void main(String args[]) {
        Notifier n = new EmailNotifier();
        SlackNotifierDecorator snd = new SlackNotifierDecorator(n);
        SMSNotifierDecorator sms = new SMSNotifierDecorator(n);

        snd.send();
        sms.send();
    }
}