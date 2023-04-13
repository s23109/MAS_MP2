package Kompozycja;

import java.util.ArrayList;
import java.util.List;

public class Room{

    private static List<Room> extent = new ArrayList<>();
    int roomNo;
    int roomFloor;
    public Building building;

    public static Room createRoom(int roomNo, int roomFloor, Building building) throws Exception{
        if (building == null){
            throw new Exception("Building must be defined");
        }

        Room room = new Room(roomNo,roomFloor,building);
        return room;
    }
    private Room(int roomNo, int roomFloor, Building building)  {
        this.roomNo = roomNo;
        this.roomFloor = roomFloor;
        this.building = building;
        building.addRoom(this);
        extent.add(this);

    }

    public Building getBuilding (){
        return this.building;
    }

    public void showInfo (){
        System.out.println(this);
        System.out.printf("Building: " + this.building);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", roomFloor=" + roomFloor +
                '}';
    }

}
