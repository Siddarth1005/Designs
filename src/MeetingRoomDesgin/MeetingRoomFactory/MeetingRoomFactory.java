package MeetingRoomDesgin.MeetingRoomFactory;

import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public interface MeetingRoomFactory {
    public String checkAvailabiltyAndBookMeetingRoom(String date, String time, Integer bookerID, List<AttendeesSubscriber> attendees);
}
