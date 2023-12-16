package org.example.repositories.booking;

import org.example.models.Booking;
import org.example.models.BookingStatusEnum;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookingRepository implements IBookingRepository {

    private final Map<Integer, Booking> bookings;
    private static BookingRepository repo;
    private static int BOOKINGS_COUNT = 1000;

    private BookingRepository() {
        bookings = new HashMap<Integer, Booking>();
    }

    public static BookingRepository getInstance() {
        if (repo == null) {
            repo = new BookingRepository();
        }
        return repo;
    }

    @Override
    public Booking addBooking(int userId, int roomId, BookingStatusEnum status, Date startDateTime, Date endDateTime) {
        Booking booking = new Booking(BOOKINGS_COUNT, userId, roomId, status, startDateTime, endDateTime);
        bookings.put(booking.getBookingId(), booking);
        BOOKINGS_COUNT += 1;
        return booking;
    }

    @Override
    public Booking getBookingById(int bookingId) {
        return bookings.get(bookingId);
    }

}
