package org.example.repositories.booking;

import org.example.models.Booking;
import org.example.models.BookingStatusEnum;

import java.util.Date;

public interface IBookingRepository {
    public Booking addBooking(int userId, int roomId, BookingStatusEnum status, Date startDateTime, Date endDateTime);

    public Booking getBookingById(int bookingId);

}
