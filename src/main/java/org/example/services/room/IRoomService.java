package org.example.services.room;

import org.example.models.Room;

public interface IRoomService {
    Room createRoom(String name, int capacity, int associatedFloorId);

}
