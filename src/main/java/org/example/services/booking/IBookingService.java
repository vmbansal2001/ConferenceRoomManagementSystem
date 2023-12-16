package org.example.services.booking;

import java.util.Date;

import org.example.models.Booking;

public interface IBookingService {
    Booking createBooking(int userId, int roomId, Date startDateTime, Date endDateTime);
}
