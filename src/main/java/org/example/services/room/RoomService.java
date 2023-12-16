package org.example.services.room;

import org.example.models.Floor;
import org.example.models.Room;
import org.example.repositories.floor.FloorRepository;
import org.example.repositories.room.RoomRepository;

public class RoomService implements IRoomService {

    private final RoomRepository roomRepository;
    private final FloorRepository floorRepository;

    public RoomService() {
        roomRepository = RoomRepository.getInstance();
        floorRepository = FloorRepository.getInstance();
    }

    @Override
    public Room createRoom(String name, int capacity, int associatedFloorId) {
        if (name.isEmpty()) {
            System.out.println("Room name is empty");
            return null;
        }

        Floor associatedFloor = floorRepository.getFloorById(associatedFloorId);
        if (associatedFloor == null) {
            System.out.println("Floor does not exist");
            return null;
        }

        return roomRepository.addRoom(name, capacity, associatedFloorId);
    }
}
