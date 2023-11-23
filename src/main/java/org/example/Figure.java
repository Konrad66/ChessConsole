package org.example;

import java.util.Locale;

public class Figure {

    private String name;
    private int x;
    private int y;
    private Color color;

    public Figure(String name, int x, int y, Color color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        if (Color.BLACK == color) {
            return name.toLowerCase(Locale.ROOT);
        }
        return name;
    }
}