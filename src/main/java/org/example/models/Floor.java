package org.example.models;

import java.util.HashMap;

public class Floor {
    private final int floorId;
    private String name;
    private final int associatedBuildingId;

    private HashMap<Integer, Room> rooms;

    public Floor(int floorId, String name, int associatedBuildingId) {
        this.floorId= floorId;
        this.name = name;
        this.associatedBuildingId = associatedBuildingId;
        this.rooms = new HashMap<>();
    }

    public int getFloorId() {
        return floorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAssociatedBuildingId() {
        return associatedBuildingId;
    }
}
