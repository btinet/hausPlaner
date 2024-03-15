package edu.tk.utility;

import java.util.HashMap;

public class Position {
    private final HashMap<String,Integer> position = new HashMap<>();

    public Position(int x, int y) {
        position.put("x",x);
        position.put("y",y);
    }

    public int getX() {
        return position.get("x");
    }

    public int getY() {
        return position.get("y");
    }

    public HashMap<String,Integer> getPosition() {
        return position;
    }

}
