package notify.factory;

import notify.notification.EmailNotification;
import notify.notification.Notification;
import notify.notification.PushNotification;
import notify.notification.SMSNotification;

/**
 * @author manhdt14
 * created in 12/21/2022 1:14 PM
 */
public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        // called switch expression
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown channel: " + channel);
        };
    }
}
