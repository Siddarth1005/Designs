package MeetingRoomDesgin.MeetingRooms;
import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;

import java.util.Date;
import java.time.LocalTime;
import java.util.List;

public interface MeetingRooms {

    public MeetingRoomData bookMeetingRoom(String datetime, String time, Integer bookerID, List<AttendeesSubscriber> attendees);

    public boolean isBooked();

    public Integer returnCapacity();

}
