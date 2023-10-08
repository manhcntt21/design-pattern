package notify;

import notify.factory.NotificationFactory;
import notify.notification.Notification;

/**
 * @author manhdt14
 * created in 12/21/2022 1:17 PM
 */
public class NotificationService {
    private NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public Notification notify(String channel) {
        return this.notificationFactory.createNotification(channel);
    }

    public static void main(String[] args) {

        try {
            NotificationService notificationService = new NotificationService(new NotificationFactory());

            Notification sms = notificationService.notify("SMS");
            sms.notifyUser();

            Notification email = notificationService.notify("EMAIL");
            email.notifyUser();

            Notification invalid = notificationService.notify("invalid");
            invalid.notifyUser();
        } catch (IllegalArgumentException e) {
            System.out.println("invalid notification: " + e.getMessage());
        }
    }
}
