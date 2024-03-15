package edu.tk.entity;

import edu.tk.entity.Floor;

import java.util.ArrayList;

public class House {

    private final ArrayList<Floor> floors = new ArrayList<>();

    public House() {
        floors.add(new Floor(this));
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public Floor getFloor(int index) {
        return floors.get(index);
    }

    public Floor getFloor(Floor floor) {
        return floors.get(floors.indexOf(floor));
    }
    
    public Floor getFirstFloor() {
        if(floors.stream().findFirst().isPresent()) {
            return floors.stream().findFirst().get();
        }
        return null;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

}
