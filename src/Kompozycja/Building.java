package Kompozycja;

import java.util.ArrayList;
import java.util.List;

public class Building {
    String adress;
    static List<Building> extent = new ArrayList<>();
    List<Room> rooms = new ArrayList<>();
    private void addExtent(Building d) {
        extent.add(d);
    }

    private void removeExtent(Building d){
        extent.remove(d);
    }

    public void createRoom(int roomNo, int roomFloor) throws Exception {
        if (this.rooms.stream().anyMatch(e -> e.roomNo == roomNo && e.roomFloor == roomFloor)){
            throw new Exception("Room number already used");
        }else {
            Room.createRoom(roomNo,roomFloor,this);
        }

    }

    public void addRoom(Room room){
        if (!rooms.contains(room)){
            rooms.add(room);
        }
    }

    public Room getRoomByAtt(int roomNo, int roomFloor){
        return rooms.stream().filter(e -> e.roomFloor == roomFloor && e.roomNo == roomNo).findFirst().orElse(null);

    }

    public Building(String adress) {
        this.adress = adress;
    }

    public void showRooms(){
        for (Room r: rooms) {
            System.out.println(r);
        }
    }




    @Override
    public String toString() {
        return "Building{" +
                "adress='" + adress + '\''+
                '}';
    }
}
