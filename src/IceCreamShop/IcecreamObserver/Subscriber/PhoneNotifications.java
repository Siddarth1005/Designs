package IceCreamShop.IcecreamObserver.Subscriber;

import IceCreamShop.IcecreamObserver.Observers.Publisher;

public class PhoneNotifications implements NotificationSubscriber{
    Publisher publisher;
    String number;
    public PhoneNotifications(Publisher publisher, String number){
        this.publisher = publisher;
        this.number = number;
    }

    @Override
    public void notifySubs() {
        System.out.println("The Suscriber has been notfied on this number " + number);
    }
}
