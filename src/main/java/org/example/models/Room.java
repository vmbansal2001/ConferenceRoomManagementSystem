package org.example.models;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Room {
    private final int roomId;
    private String name;
    private int capacity;
    private final int associatedFloorId;

    private HashMap<Date, List<BookedSlot>> bookedSlots;

    public Room(int roomId, String name, int capacity, int associatedFloorId) {
        this.roomId = roomId;
        this.name = name;
        this.capacity = capacity;
        this.associatedFloorId = associatedFloorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAssociatedFloorId() {
        return associatedFloorId;
    }

    public int getRoomId() {
        return roomId;
    }
}
