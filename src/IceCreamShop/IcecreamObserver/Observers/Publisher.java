package IceCreamShop.IcecreamObserver.Observers;

import IceCreamShop.IcecreamObserver.Subscriber.NotificationSubscriber;

public interface Publisher {
    void addSubscriber(NotificationSubscriber subscriber);
    void removeSubscriber(NotificationSubscriber subscriber);
    void upDateAllSubscribers();
}
