package org.example.repositories.floor;

import org.example.models.Floor;

import java.util.HashMap;
import java.util.Map;

public class FloorRepository implements IFloorRepository {

    private final Map<Integer, Floor> floors;
    private static FloorRepository repo = null;
    private static int FLOORS_COUNT = 1000;

    private FloorRepository() {
        floors = new HashMap<Integer, Floor>();
    }

    public static synchronized FloorRepository getInstance() {
        if (repo == null) {
            repo = new FloorRepository();
        }
        return repo;
    }

    @Override
    public Floor addFloor(String name, int associatedBuildingId) {
        Floor floor = new Floor(FLOORS_COUNT, name, associatedBuildingId);
        floors.put(floor.getFloorId(), floor);
        FLOORS_COUNT += 1;
        return floor;
    }

    @Override
    public Floor getFloorById(int floorId) {
        return floors.get(floorId);
    }

    public Map<Integer, Floor> getAllFloors() {
        return floors;
    }

}
