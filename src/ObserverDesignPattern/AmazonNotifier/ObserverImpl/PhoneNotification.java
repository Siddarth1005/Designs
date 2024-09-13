package ObserverDesignPattern.AmazonNotifier.ObserverImpl;

import ObserverDesignPattern.AmazonNotifier.Interface.Observable;
import ObserverDesignPattern.AmazonNotifier.Interface.Observer;

public class PhoneNotification implements Observer {
    Observable observableObj;
    String phoneNumber;

    public PhoneNotification(Observable observableObj, String number) {
        this.observableObj = observableObj;
        this.phoneNumber = number;
    }

    @Override
    public void update() {
        System.out.println("Hey the product is now available");
        sendNotifications();
    }

    @Override
    public void sendNotifications() {
        System.out.println("The notification has been sent to" + phoneNumber) ;
    }
}
