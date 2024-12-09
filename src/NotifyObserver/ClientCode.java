package NotifyObserver;

import NotifyObserver.Observable.Publisher;
import NotifyObserver.Observable.PublisherAllMessages;
import NotifyObserver.Observable.PublisherPrivateMessages;
import NotifyObserver.Observer.MessageNotfication;
import NotifyObserver.Observer.SubScriber;

import java.util.Scanner;

public class ClientCode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to me notified about private message or notfied about all messages?");
        String input  = scanner.nextLine();
        if(input.equals("All Messages")){
            Publisher allMessagePubs = new PublisherAllMessages();
            SubScriber siddarth  = new MessageNotfication(allMessagePubs);
            allMessagePubs.addSubscribers(siddarth);
            allMessagePubs.triggerNotification("Hello Everyone");
        } else if (input.equals("Private Messages")) {
            Publisher privateMessages = new PublisherPrivateMessages();
            SubScriber siddarth  = new MessageNotfication(privateMessages);
            privateMessages.addSubscribers(siddarth);
            privateMessages.triggerNotification("Hello Siddarth, please present");
        }
    }
}
