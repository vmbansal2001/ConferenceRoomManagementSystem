package org.example.services.floor;

import org.example.models.Building;
import org.example.models.Floor;
import org.example.repositories.building.BuildingRepository;
import org.example.repositories.floor.FloorRepository;
import org.example.utils.exceptions.BuildingNotFound;

public class FloorService implements IFloorService {

    private final FloorRepository floorRepository;
    private final BuildingRepository buildingRepository;

    public FloorService() {
        floorRepository = FloorRepository.getInstance();
        buildingRepository = BuildingRepository.getInstance();
    }

    @Override
    public Floor createFloor(String name, int associatedBuildingId) throws BuildingNotFound {

        if (name.isEmpty()) {
            System.out.println("Floor name is empty");
            return null;
        }

        Building associatedBuilding = buildingRepository.getBuildingById(associatedBuildingId);
        if (associatedBuilding == null) {
            System.out.println("Building does not exist");
            throw new BuildingNotFound("Building Does not exist");
        }

        return floorRepository.addFloor(name, associatedBuildingId);
    }

}

