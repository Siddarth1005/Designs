package MeetingRoomDesgin.MeetingRooms;
import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;

import java.util.Date;
import java.time.LocalTime;
import java.util.List;

public class MeetingRoomData {
    String roomName;
    String meetingDate;
    String metingTime;
    Integer user_id;
    List<AttendeesSubscriber> attendees;

    public MeetingRoomData(String roomName, String meetingDate, String metingTime, Integer user_id, List<AttendeesSubscriber> attendees) {
        this.roomName = roomName;
        this.meetingDate = meetingDate;
        this.metingTime = metingTime;
        this.user_id = user_id;
        this.attendees = attendees;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public void setMetingTime(String metingTime) {
        this.metingTime = metingTime;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setAttendees(List<AttendeesSubscriber> attendees) {
        this.attendees = attendees;
    }
}
