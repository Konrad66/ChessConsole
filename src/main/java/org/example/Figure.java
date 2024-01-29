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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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

    public Color getColor() {
        return color;
    }
}