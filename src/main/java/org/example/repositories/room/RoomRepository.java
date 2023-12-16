package org.example.repositories.room;

import org.example.models.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomRepository implements IRoomRepository {

    private final Map<Integer, Room> rooms;
    private static RoomRepository repo;
    private static int ROOMS_COUNT = 1000;

    private RoomRepository() {
        rooms = new HashMap<Integer, Room>();
    }

    public static RoomRepository getInstance() {
        if (repo == null) {
            repo = new RoomRepository();
        }
        return repo;
    }

    @Override
    public Room addRoom(String name, int capacity, int associatedFloorId) {
        Room room = new Room(ROOMS_COUNT, name, capacity, associatedFloorId);
        rooms.put(room.getRoomId(), room);
        ROOMS_COUNT += 1;
        return room;
    }

    @Override
    public Room getRoomById(int roomId) {
        return rooms.get(roomId);
    }

    public Map<Integer, Room> getAllRooms() {
        return rooms;
    }


}
