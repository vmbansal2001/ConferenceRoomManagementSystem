package org.example;

import org.example.models.*;
import org.example.services.booking.BookingService;
import org.example.services.building.BuildingService;
import org.example.services.floor.FloorService;
import org.example.services.room.RoomService;
import org.example.services.user.UserService;
import org.example.utils.exceptions.BuildingNotFound;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws BuildingNotFound {
        UserService userService = new UserService();
        BuildingService buildingService = new BuildingService();
        FloorService floorService = new FloorService();
        RoomService roomService = new RoomService();
        BookingService bookingService = new BookingService();

        User vipulUser = userService.createUser("Vipul", "vipul@gmail.com", "12345");
        User rohanUser = userService.createUser("Rohan", "rohan@gmail.com", "43256");

        Building buildingOne = buildingService.createBuilding("Building One");

        Floor floorA = floorService.createFloor("A", buildingOne.getBuildingId());
        Room roomAOne = roomService.createRoom("Room A One", 10, floorA.getFloorId());
        Room roomATwo = roomService.createRoom("Room B Two", 15, floorA.getFloorId());

        Floor floorB = floorService.createFloor("B", buildingOne.getBuildingId());
        Room roomBOne = roomService.createRoom("Room B One", 8, floorB.getFloorId());

        Floor floorC = floorService.createFloor("C", buildingOne.getBuildingId());
        Room roomCOne = roomService.createRoom("Room C One", 8, floorC.getFloorId());

        Floor floorD = floorService.createFloor("D", buildingOne.getBuildingId());
        Room roomDOne = roomService.createRoom("Room D One", 18, floorD.getFloorId());

        Date currentTime = new Date();

        Booking bookingOne = bookingService.createBooking(vipulUser.getUserId(), roomAOne.getRoomId(), currentTime, currentTime);
        Booking bookingTwo = bookingService.createBooking(rohanUser.getUserId(), roomAOne.getRoomId(), currentTime, currentTime);

        System.out.println(bookingOne.getBookingId());
        System.out.println(bookingTwo.getBookingId());
    }
}