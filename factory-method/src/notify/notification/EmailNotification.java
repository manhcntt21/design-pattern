package notify.notification;

/**
 * @author manhdt14
 * created in 12/21/2022 1:13 PM
 */
public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
