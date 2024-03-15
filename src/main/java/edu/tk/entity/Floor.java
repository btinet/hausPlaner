package edu.tk.entity;

import edu.tk.utility.Position;

import java.util.ArrayList;
import java.util.HashMap;

public class Floor {

    private final House house;
    private final HashMap<Position,Element> elements = new HashMap<>();
    private final ArrayList<Position> usedPositions = new ArrayList<>();
    private final ArrayList<Position> availablePositions = new ArrayList<>();

    public Floor(House house) {
        this.house = house;
        // availablePositions nach Größe der Etage befüllen. Eig. abhängig von House?
    }

    public House getHouse() {
        return house;
    }

    public Element getElement(Position position) {
        return elements.get(position);
    }

    public void addElement(Element element) {
        elements.put(element.getPosition(),element);
    }

    public boolean removeElement(Element element) {
        return elements.remove(element.getPosition(),element);
    }

    public boolean elementIsPresent(Element element) {
        return elements.containsValue(element);
    }

}
