package ObserverDesignPattern;


import ObserverDesignPattern.AmazonNotifier.Interface.Observer;
import ObserverDesignPattern.AmazonNotifier.ObservableImpl.IphoneObservable;
import ObserverDesignPattern.AmazonNotifier.ObserverImpl.EmailNotification;
import ObserverDesignPattern.AmazonNotifier.ObserverImpl.PhoneNotification;

public class ObserverMain {
    public static void main(String[] args) {
        Observer observer1 = new PhoneNotification(new IphoneObservable(), "7612912345");
        Observer observer2 = new EmailNotification(new IphoneObservable(), "sid@gmail.com");

        IphoneObservable iphoneStock = new IphoneObservable();

        iphoneStock.addObservers(observer2);
        iphoneStock.addObservers(observer1);

        iphoneStock.updateData(40);
        iphoneStock.updateData(30);


    }
}