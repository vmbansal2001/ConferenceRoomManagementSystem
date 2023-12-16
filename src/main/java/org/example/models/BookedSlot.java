package org.example.models;
import java.util.Date;

public class BookedSlot {
    private final int roomId;
    private Date startDateTime;
    private Date endDateTime;
    private int associatedBookingId;

    public BookedSlot(int roomId, Date startDateTime, Date endDateTime, int associatedBookingId) {
        this.roomId = roomId;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.associatedBookingId = associatedBookingId;
    }

    public int getRoomId() {
        return roomId;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public int getAssociatedBookingId() {
        return associatedBookingId;
    }

    public void setAssociatedBookingId(int associatedBookingId) {
        this.associatedBookingId = associatedBookingId;
    }
}
