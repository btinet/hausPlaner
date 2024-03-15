package edu.tk;

import edu.tk.entity.Element;
import edu.tk.entity.Floor;
import edu.tk.entity.House;
import edu.tk.utility.Position;

public class Main {

    static House house;

    public static void main(String[] args) {

        // Mit Instantiierung des Hauses wird automatisch eine Etage instantiiert.
        house = new House();

        // Etage abrufen
        Floor erdgeschoss = house.getFirstFloor();

        // Element instantiieren.
        Element door = new Element();
        door.setPosition(new Position(0,0));

        // Element in Etage platzieren.
        erdgeschoss.addElement(door);
    }
}