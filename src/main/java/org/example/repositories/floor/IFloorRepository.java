package org.example.repositories.floor;

import org.example.models.Floor;

public interface IFloorRepository {
    public Floor addFloor(String name, int associatedBuildingId);

    public Floor getFloorById(int floorId);
}
