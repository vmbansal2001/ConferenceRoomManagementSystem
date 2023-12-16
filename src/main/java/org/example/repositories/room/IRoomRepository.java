package org.example.repositories.room;

import org.example.models.Room;

public interface IRoomRepository {

    public Room addRoom(String name, int capacity, int associatedBuildingId);

    public Room getRoomById(int roomId);
}
