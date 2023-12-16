package org.example.models;

import java.util.HashMap;

public class Building {

    private final int buildingId;
    private String name;

    private HashMap<Integer, Floor> floors;

    public Building(int buildingId, String name) {
        this.buildingId = buildingId;
        this.name = name;
        this.floors = new HashMap<>();
    }

    public int getBuildingId() {
        return buildingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
