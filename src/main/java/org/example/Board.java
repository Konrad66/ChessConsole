package org.example;

import java.util.ArrayList;
import java.util.List;

public class Board {

    final static int WIDTH = 8;
    final static int HEIGHT = 8;
    final private List<Figure> figures = new ArrayList<>();

    public String composeBoardView() {
        String board = "";
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {

                boolean isPlayer = false;
                for (Figure figure : figures) {
                    if (figure.getY() == y && figure.getX() == x) {
                        board = board + " " + figure.getName() + " ";
                        isPlayer = true;
                    }
                }
                if (!isPlayer) {
                    board += " * ";
                }
            }
            board = board + "\n";
        }
        return board;
    }


    public void createFigures() {
        Figure pawn = new Figure("P", 0, 6);
        figures.add(pawn);
        Figure blackPawn = new Figure("P", 0, 1);
        figures.add(blackPawn);
    }
}