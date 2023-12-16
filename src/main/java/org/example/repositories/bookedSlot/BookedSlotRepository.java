package org.example.repositories.bookedSlot;

import org.example.models.BookedSlot;

import java.util.Date;
import java.util.*;

public class BookedSlotRepository implements IBookedSlotRepository {

    private final Map<Integer, BookedSlot> bookedSlots;
    private static BookedSlotRepository repo;


    private BookedSlotRepository() {
        bookedSlots = new HashMap<Integer, BookedSlot>();
    }

    public static BookedSlotRepository getInstance() {
        if (repo == null) {
            repo = new BookedSlotRepository();
        }
        return repo;
    }

    @Override
    public BookedSlot addBookedSlot(int roomId, Date startDateTime, Date endDateTime, int associatedBookingId) {
        BookedSlot bookedSlot = new BookedSlot(roomId, startDateTime, endDateTime, associatedBookingId);
        bookedSlots.put(associatedBookingId, bookedSlot);
        return bookedSlot;
    }

    @Override
    public BookedSlot getBookedSlotByBookingId(int bookingId) {
        return bookedSlots.get(bookingId);
    }

    @Override
    public List<BookedSlot> getBookedSlotsByRoomId(int roomId) {
        Collection<BookedSlot> allBookedSlots = bookedSlots.values();
        List<BookedSlot> filteredBookedSlots = new LinkedList<BookedSlot>();

        for (BookedSlot bookedSlot : allBookedSlots) {
            int slotRoomId = bookedSlot.getRoomId();
            if (slotRoomId == roomId) {
                filteredBookedSlots.add(bookedSlot);
            }
        }

        return filteredBookedSlots;
    }

}
