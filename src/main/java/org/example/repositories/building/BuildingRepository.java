package org.example.repositories.building;

import org.example.models.Building;

import java.util.HashMap;
import java.util.Map;

public class BuildingRepository implements IBuildingRepository {
    private final Map<Integer, Building> buildings;
    private static BuildingRepository repo;
    private static int BUILDINGS_COUNT = 1000;

    private BuildingRepository() {
        buildings = new HashMap<Integer, Building>();
    }

    public static BuildingRepository getInstance() {
        if (repo == null) {
            repo = new BuildingRepository();
        }
        return repo;
    }

    @Override
    public Building addBuilding(String name) {
        Building building = new Building(BUILDINGS_COUNT, name);
        buildings.put(building.getBuildingId(), building);
        BUILDINGS_COUNT += 1;
        return building;
    }

    @Override
    public Building getBuildingById(int buildingId) {
        return buildings.get(buildingId);
    }

    public Map<Integer, Building> getAllBuildings() {
        return buildings;
    }
}
