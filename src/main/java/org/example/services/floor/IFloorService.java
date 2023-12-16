package org.example.services.floor;

import org.example.models.Floor;
import org.example.utils.exceptions.BuildingNotFound;

public interface IFloorService {
    Floor createFloor(String name, int associatedBuildingId) throws BuildingNotFound;
}
