package IceCreamShop.IcecreamObserver.Subscriber;

import IceCreamShop.IcecreamObserver.Observers.Publisher;

public class EmailNotifications implements NotificationSubscriber{
    Publisher publisher;
    String email;
    public EmailNotifications(Publisher publisher, String email){
        this.publisher = publisher;
        this.email = email;
    }

    @Override
    public void notifySubs() {
        System.out.println("The Suscriber has been notfied on this email " + email);
    }
}
