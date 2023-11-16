package org.example;

public class Figure {


    private String name;
    private int x;
    private int y;

    public Figure(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public String getName() {
        return name;
    }
}
