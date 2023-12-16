package org.example.services.booking;

import org.example.models.*;
import org.example.repositories.bookedSlot.BookedSlotRepository;
import org.example.repositories.booking.BookingRepository;
import org.example.repositories.room.RoomRepository;
import org.example.repositories.user.UserRepository;

import java.util.Date;
import java.util.List;

public class BookingService implements IBookingService {

    private final UserRepository userRepository;
    private final RoomRepository roomRepository;
    private final BookingRepository bookingRepository;
    private final BookedSlotRepository bookedSlotRepository;

    public BookingService() {
        userRepository = UserRepository.getInstance();
        roomRepository = RoomRepository.getInstance();
        bookingRepository = BookingRepository.getInstance();
        bookedSlotRepository = BookedSlotRepository.getInstance();
    }

    @Override
    public Booking createBooking(int userId, int roomId, Date startDateTime, Date endDateTime) {
        User user = userRepository.getUserByUserId(userId);
        if (user == null) {
            System.out.println("User does not exist");
            return null;
        }

        Room room = roomRepository.getRoomById(roomId);
        if (room == null) {
            System.out.println("Room does not exist");
            return null;
        }

        List<BookedSlot> allBookedSlotsForRoom = bookedSlotRepository.getBookedSlotsByRoomId(roomId);
        for (BookedSlot bookedSlot : allBookedSlotsForRoom) {
            System.out.println(bookedSlot.getAssociatedBookingId());
        }

        // TODO: check for existing bookings

        Booking booking = bookingRepository.addBooking(userId, roomId, BookingStatusEnum.UPCOMING, startDateTime, endDateTime);
        bookedSlotRepository.addBookedSlot(roomId, startDateTime, endDateTime, booking.getBookingId());
        return booking;
    }
}
