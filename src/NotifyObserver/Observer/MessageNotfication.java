package NotifyObserver.Observer;

import NotifyObserver.Observable.Publisher;

public class MessageNotfication implements SubScriber{

    Publisher pubs;
    public MessageNotfication(Publisher pubs){
        this.pubs = pubs;
    }
    @Override
    public void notifyUser(String message) {
       System.out.println("This user has been notified with message " + message);
    }
}
