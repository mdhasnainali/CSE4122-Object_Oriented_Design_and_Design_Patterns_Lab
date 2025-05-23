public class NotificationFactory {

    public Notification createNotification(String notificationType) {
        if (notificationType.equals("SMS")) {
            return new SMSNotification();
        }
        else if (notificationType.equals("EMAIL")) {
            return new EmailNotification();
        }
        else if (notificationType.equals("PUSH")) {
            return new PushNotification();
        }
        else {
            return null;
        }
    }
}
