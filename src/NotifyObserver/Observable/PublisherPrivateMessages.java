package NotifyObserver.Observable;

import NotifyObserver.Observer.SubScriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherPrivateMessages implements Publisher{

    List<SubScriber> ONLY_PRIVATE_MESSAGES = new ArrayList<>();
    @Override
    public void addSubscribers(SubScriber subs) {
        ONLY_PRIVATE_MESSAGES.add(subs);
    }

    @Override
    public void removeSubscriber(SubScriber subs) {
        ONLY_PRIVATE_MESSAGES.remove(subs);
    }

    @Override
    public void upDateAllSubs(String message) {
        for(SubScriber subs : ONLY_PRIVATE_MESSAGES){
            subs.notifyUser(message);
        }
    }

    @Override
    public void triggerNotification( String message) {
        upDateAllSubs(message);
    }
}
