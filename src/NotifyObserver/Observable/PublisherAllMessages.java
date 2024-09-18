package NotifyObserver.Observable;

import NotifyObserver.Observer.SubScriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherAllMessages implements Publisher{
    List<SubScriber> ALL_MESSAGES = new ArrayList<>();
    @Override
    public void addSubscribers(SubScriber subs) {
        ALL_MESSAGES.add(subs);
    }

    @Override
    public void removeSubscriber(SubScriber subs) {
        ALL_MESSAGES.remove(subs);
    }

    @Override
    public void upDateAllSubs(String message) {
        for(SubScriber subs : ALL_MESSAGES){
            subs.notifyUser(message);
        }
    }

    @Override
    public void triggerNotification(String message) {
        upDateAllSubs(message);
    }
}
