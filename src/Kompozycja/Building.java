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

    public void addRoom (int roomNo, int roomFloor) throws Exception {
        if (this.rooms.stream().anyMatch(e -> e.roomNo == roomNo)){
            throw new Exception("Room number already used");
        }else {
            this.rooms.add(new Room(roomNo,roomFloor));
        }

    }

    public Building(String adress) {
        this.adress = adress;
    }

    private class Room{
        int roomNo;
        int roomFloor;

        private Room(int roomNo, int roomFloor) {
            this.roomNo = roomNo;
            this.roomFloor = roomFloor;
        }

        @Override
        public String toString() {
            return "Room{" +
                    "roomNo=" + roomNo +
                    ", roomFloor=" + roomFloor +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "Building{" +
                "adress='" + adress + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
