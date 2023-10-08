package notify.notification;

/**
 * @author manhdt14
 * created in 12/21/2022 1:14 PM
 */
public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}
