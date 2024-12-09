package MeetingRoomDesgin.MeetingsNotifier.Publisher;

import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;

public interface MeetingRoomAttendeesPublisher {
    void addAttendees(AttendeesSubscriber attendees);
    void removeAttendees(AttendeesSubscriber attendees);
    void notifyAllAttendees();

}
