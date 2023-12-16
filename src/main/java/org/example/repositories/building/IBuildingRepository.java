package org.example.repositories.building;

import org.example.models.Building;

public interface IBuildingRepository {
    public Building addBuilding(String name);

    public Building getBuildingById(int buildingId);

}
