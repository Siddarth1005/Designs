package MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers;

import MeetingRoomDesgin.MeetingsNotifier.Publisher.MeetingRoomAttendeesPublisher;

public class EmailNotifier implements AttendeesSubscriber{

    MeetingRoomAttendeesPublisher meetingsNotifier;
    String email;

    public EmailNotifier(MeetingRoomAttendeesPublisher meetingsNotifier, String email){
        this.meetingsNotifier = meetingsNotifier;
        this.email = email;
    }
    @Override
    public void notifyAttendees() {
        System.out.println("This subscriber has been notified: " + email);
    }
}
