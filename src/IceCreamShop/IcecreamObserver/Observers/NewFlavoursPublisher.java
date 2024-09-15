package IceCreamShop.IcecreamObserver.Observers;

import IceCreamShop.IcecreamObserver.Subscriber.NotificationSubscriber;

import java.util.ArrayList;
import java.util.List;

public class NewFlavoursPublisher implements Publisher{

    List<NotificationSubscriber> newFlavourSubscribers =  new ArrayList<>();
    NotificationSubscriber subscriber;
    @Override
    public void addSubscriber(NotificationSubscriber subscriber) {
        newFlavourSubscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(NotificationSubscriber subscriber) {
        newFlavourSubscribers.remove(subscriber);
    }

    @Override
    public void upDateAllSubscribers() {
        for(NotificationSubscriber subs : newFlavourSubscribers){
            subs.notifySubs();
        }
    }
}
