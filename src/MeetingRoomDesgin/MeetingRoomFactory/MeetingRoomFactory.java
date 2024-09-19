package MeetingRoomDesgin.MeetingRoomFactory;

import MeetingRoomDesgin.MeetingRooms.MeetingRooms;
import MeetingRoomDesgin.MeetingsNotifier.AttendeesSubscribers.AttendeesSubscriber;

import java.util.List;

public interface MeetingRoomFactory {
    public MeetingRooms getMeetingRoomInstance(List<AttendeesSubscriber> atendees);
}
