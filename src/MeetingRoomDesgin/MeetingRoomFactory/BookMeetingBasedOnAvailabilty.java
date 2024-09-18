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
    public String checkAvailabiltyAndBookMeetingRoom(String date, String time, Integer bookerID, List<AttendeesSubscriber> attendees) {
        if(!himalayanRoom.isBooked() && attendees.size() <= himalayanRoom.returnCapacity()){
            himalayanRoom.bookMeetingRoom(date, time, bookerID, attendees);
            return ("Himalaya Meeting Room Booked");
        }else if(!vindhyaRoom.isBooked() && attendees.size() <= himalayanRoom.returnCapacity()){
            vindhyaRoom.bookMeetingRoom(date, time, bookerID, attendees);
            return ("Vindhaya Meeting Room Booked");
        }else return "Sorry Meeting Room Not Available";
    };
}
