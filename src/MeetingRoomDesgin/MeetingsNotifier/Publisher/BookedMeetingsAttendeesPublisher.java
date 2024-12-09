package MeetingRoomDesgin.MeetingsNotifier.Publisher;


import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;

import java.util.ArrayList;
import java.util.List;

public class BookedMeetingsAttendeesPublisher implements MeetingRoomAttendeesPublisher {

    List<AttendeesSubscriber> allSubscribers = new ArrayList<>();
    @Override
    public void addAttendees(AttendeesSubscriber subScriber) {
        allSubscribers.add(subScriber);
    }

    @Override
    public void removeAttendees(AttendeesSubscriber subScriber) {
        allSubscribers.remove(subScriber);
    }

    @Override
    public void notifyAllAttendees() {
        for(AttendeesSubscriber subs : allSubscribers ){
            subs.notifyAttendees();
        }
    }
}
