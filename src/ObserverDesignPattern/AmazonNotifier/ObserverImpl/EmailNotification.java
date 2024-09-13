package ObserverDesignPattern.AmazonNotifier.ObserverImpl;

import ObserverDesignPattern.AmazonNotifier.Interface.Observable;
import ObserverDesignPattern.AmazonNotifier.Interface.Observer;

public class EmailNotification implements Observer {
    Observable observableObj;
    String mail;

    public EmailNotification(Observable observableObj, String email) {
        this.observableObj = observableObj;
        this.mail = email;
    }

    @Override
    public void update() {
        System.out.println("Hey the product is now available");
        sendNotifications();
    }

    @Override
    public void sendNotifications() {
        System.out.println("The mail has been sent to" + mail) ;
    }
}
