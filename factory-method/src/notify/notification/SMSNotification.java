package notify.notification;

/**
 * @author manhdt14
 * created in 12/21/2022 1:12 PM
 */
public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
