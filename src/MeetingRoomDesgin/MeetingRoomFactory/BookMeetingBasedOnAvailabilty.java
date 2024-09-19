package MeetingRoomDesgin.MeetingRoomFactory;

import MeetingRoomDesgin.MeetingRooms.HimalayaMeetingRoom;
import MeetingRoomDesgin.MeetingRooms.MeetingRooms;
import MeetingRoomDesgin.MeetingRooms.VindhayaMeetingRoom;
import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class BookMeetingBasedOnAvailabilty implements MeetingRoomFactory{

    MeetingRooms himalayanRoom = new HimalayaMeetingRoom();
    MeetingRooms vindhyaRoom =  new VindhayaMeetingRoom();

    @Override
    public MeetingRooms getMeetingRoomInstance(List<AttendeesSubscriber> attendees) {
        if(!himalayanRoom.isBooked() && attendees.size() <= himalayanRoom.returnCapacity()){
            return new HimalayaMeetingRoom();
        }else if(!vindhyaRoom.isBooked() && attendees.size() <= himalayanRoom.returnCapacity()){
            return new VindhayaMeetingRoom();
        }
        return null;
    }
}
