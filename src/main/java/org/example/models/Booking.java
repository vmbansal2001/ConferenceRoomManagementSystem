package org.example.models;

import java.util.Date;

public class Booking {


    private final int bookingId;
    private int userId;
    private int roomId;
    private BookingStatusEnum status;
    Date startDateTime;
    Date endDateTime;

    public Booking(int bookingId, int userId, int roomId, BookingStatusEnum status, Date startDateTime, Date endDateTime) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.roomId = roomId;
        this.status = status;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BookingStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BookingStatusEnum status) {
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }

}
