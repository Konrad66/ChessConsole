package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {

    final static int WIDTH = 8;
    final static int HEIGHT = 8;
    final private List<Figure> figures = new ArrayList<>();
    final private List<Character> figureSymbols = new ArrayList<>(List.of('T', 'K', 'B', 'Q', 'K', 'B', 'K', 'T'));

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
        for (int i = 0; i < 8; i++) {
            Figure pawn = new Figure("P", i, 6, Color.WHITE);
            figures.add(pawn);
            Figure blackPawn = new Figure("P", i, 1, Color.BLACK);
            figures.add(blackPawn);
            Figure figure = new Figure(figureSymbols.get(i) + "", i, 7, Color.WHITE);
            figures.add(figure);
            Figure blackFigure = new Figure(figureSymbols.get(i) + "", i, 0, Color.BLACK);
            figures.add(blackFigure);
        }
    }

    public String move() {
        Scanner scanner = new Scanner(System.in);
        String myMove = scanner.next();
        System.out.println("Tell me want you want to do. (For example: a2a3)");
        return myMove;
    }

    public List<Figure> getFigures(){
        return new ArrayList<>(figures);
    }
}

//TODO zrobić testy jednostkowe dla pionów
// sprawdzić w testach działanie kolorów;
// testy jednostkowe dla pionów