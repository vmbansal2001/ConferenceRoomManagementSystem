package org.example.repositories.bookedSlot;

import org.example.models.BookedSlot;

import java.util.Date;
import java.util.List;

public interface IBookedSlotRepository {
    public BookedSlot addBookedSlot(int roomId, Date startDateTime, Date endDateTime, int associatedBookingId);

    public BookedSlot getBookedSlotByBookingId(int bookingId);

    public List<BookedSlot> getBookedSlotsByRoomId(int roomId);

}
