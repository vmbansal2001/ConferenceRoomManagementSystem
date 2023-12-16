package org.example.services.building;

import org.example.models.Building;
import org.example.repositories.building.BuildingRepository;

public class BuildingService implements IBuildingService {

    private final BuildingRepository buildingRepository;

    public BuildingService() {
        buildingRepository = BuildingRepository.getInstance();
    }

    @Override
    public Building createBuilding(String name) {
        if (name.isEmpty()) {
            System.out.println("Name is empty");
            return null;
        }
        return buildingRepository.addBuilding(name);
    }
}
