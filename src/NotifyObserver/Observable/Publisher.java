package NotifyObserver.Observable;

import NotifyObserver.Observer.SubScriber;

public interface Publisher {
    void addSubscribers(SubScriber subs);
    void removeSubscriber(SubScriber subs);
    void upDateAllSubs(String message);
    void triggerNotification(String message);
}
