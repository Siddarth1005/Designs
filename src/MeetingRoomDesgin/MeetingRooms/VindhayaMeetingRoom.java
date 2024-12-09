package MeetingRoomDesgin.MeetingRooms;

import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;
import MeetingRoomDesgin.MeetingsNotifier.Publisher.BookedMeetingsAttendeesPublisher;
import MeetingRoomDesgin.MeetingsNotifier.Publisher.MeetingRoomAttendeesPublisher;

import java.util.Date;
import java.time.LocalTime;
import java.util.List;

public class VindhayaMeetingRoom implements MeetingRooms{

    public boolean is_booked = false;
    public final Integer MEETING_ROOM_CAPACITY = 10;
    public final String ROOM_NAME = "Vindhya";


    @Override
    public MeetingRoomData bookMeetingRoom(String date, String time, Integer bookerID, List<AttendeesSubscriber> attendees) {
        MeetingRoomData meetingsData = new MeetingRoomData(ROOM_NAME, date, time, bookerID, attendees);
        is_booked = true;
        MeetingRoomAttendeesPublisher sendNotificationforVindhaya = new BookedMeetingsAttendeesPublisher();
        for (AttendeesSubscriber subs : attendees){
            sendNotificationforVindhaya.addAttendees(subs);
        }
        sendNotificationforVindhaya.notifyAllAttendees();
        return meetingsData;
    }

    @Override
    public boolean isBooked() {
        return is_booked;
    }

    @Override
    public Integer returnCapacity() {
        return MEETING_ROOM_CAPACITY;
    }
}
