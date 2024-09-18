package MeetingRoomDesgin;

import MeetingRoomDesgin.MeetingRoomFactory.BookMeetingBasedOnAvailabilty;
import MeetingRoomDesgin.MeetingRoomFactory.MeetingRoomFactory;
import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;
import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.EmailNotifier;
import MeetingRoomDesgin.MeetingsNotifier.Publisher.BookedMeetingsAttendeesPublisher;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ClientCode {

    public static void main(String[] args) {

        List<AttendeesSubscriber> allAttendees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date you want to book the meeting for?");
        String date = scanner.nextLine();
        System.out.println("Please enter the time you want to book the meeting for?");
        String time  = scanner.nextLine();
        System.out.println("Please enter your Employee ID");
        Integer iD = Integer.valueOf(scanner.nextLine());
        BookedMeetingsAttendeesPublisher publisher = new BookedMeetingsAttendeesPublisher();
        AttendeesSubscriber attendee1 = new EmailNotifier(publisher, "attendee1@gmail.com");
        AttendeesSubscriber attendee2 = new EmailNotifier(publisher, "attendee2@gmail.com");
        AttendeesSubscriber attendee3 = new EmailNotifier(publisher, "attendee3@gmail.com");
        allAttendees.add(attendee1);
        allAttendees.add(attendee2);
        allAttendees.add(attendee3);

        MeetingRoomFactory bookMeeting  = new BookMeetingBasedOnAvailabilty();
        bookMeeting.checkAvailabiltyAndBookMeetingRoom(date,time,iD,allAttendees);



    }
}
