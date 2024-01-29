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

    public void  move(){
        String moveInput = readMoveInput();
        String fromInput=  "?";
        String toInput= "?";

        int[] fromCoords = readCords(fromInput);
        int[] toCoords = readCords(toInput);

        //jak uzyc metody get figure zeby upewnic sie ze fromCoords to twoja figura to coords jest puste albo przeciwnik?

    }



    public String readMoveInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me what you want to do. (For example: a2a3)");
        String myMove = scanner.next();
        return myMove;
    }

    /*
    //jedna metoda do odczytywania i jedna do przekazywania -TDD
//musimy zinterpretować komende np a2a3 (string) na x1,y1 oraz x2, y2 (int)
    //metoda czy poprawny ruch


     */
    public int[] readCords(String input){
        return null;
    }

    public Figure getFigure(int x, int y){
        for (Figure figure : figures) {
            if(figure.getX() == x && figure.getY() == y){
                return figure;
            }
        }
        return null;
    }
}


//todo pilnowanie planszy - żeby nie dało się ruszać poza plansze





/*
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


    public void move() {
        /*
        String moveInput = readMoveInput();

        String[] coordinates = moveInput.split(" ");

        if (coordinates.length == 2) {
            String fromCoordinates = coordinates[0];
            String toCoordinates = coordinates[1];

            int fromX = fromCoordinates.charAt(0) - 'A';
            int fromY = Integer.parseInt(fromCoordinates.substring(1)) - 1;

            int toX = toCoordinates.charAt(0) - 'A';
            int toY = Integer.parseInt(toCoordinates.substring(1)) -1;
        } else {
            System.out.println("Invalid format. Enter coordinates in  format.");
        }



String moveInput = readMoveInput();

String fromInput = moveInput.substring(0, 2);
String toInput = moveInput.substring(2);

int[] fromCoords = readCords(fromInput);
int[] toCoords = readCords(toInput);


        if (fromCoords == null || toCoords == null) {
        return;
        }
Figure fromFigure = getFigure(fromCoords[0], fromCoords[1]);
Figure toFigure = getFigure(toCoords[0], toCoords[1]);

        if (fromFigure == null) {
        System.out.println("Invalid move. Source square is empty.");
            return;
                    }

                    //problem jest wtedy gdy:
                    //jest tam naszej figury
                    //nie ma przeciwnika ani wolnego pola





                    if (toFigure != null && toFigure.getColor() == Color.WHITE) {
        System.out.println("Tutaj stoi nasza figura.");
            return;
                    }
                    fromFigure.setX(toCoords[0]);
        fromFigure.setY(toCoords[1]);
        System.out.println("Move successful!");


        if(toFigure != null && toFigure.getColor() == Color.BLACK){
        figures.remove(toFigure);
            System.out.println("Zbito!");
        }



        /*
        if (fromCoords != null && toCoords != null) {
            Figure fromFigure = getFigure(fromCoords[0], fromCoords[1]);
            Figure toFigure = getFigure(toCoords[0], toCoords[1]);

            if (fromFigure != null) {

                // Sprawdzenie czy pole docelowe jest puste
                if (toFigure == null) {
                    // Ruch jest poprawny - wykonaj go
                    fromFigure.setX(toCoords[0]);
                    fromFigure.setY(toCoords[1]);
                    System.out.println("Move successful!");
                } else {
                    System.out.println("Invalid move. Destination square is not empty.");
                }
            } else {
                System.out.println("Invalid move. Source square is empty.");
            }
        }


                }






        String fromInput = "s";
        String toInput = "?";

        int[] fromCoords = readCords(fromInput);
        int[] toCoords = readCords(toInput);

        //jak uzyc metody get figure zeby upewnic sie ze fromCoords to twoja figura to coords jest puste albo przeciwnik?


public void beat(Player player) {
        for (Player other : players) {
            if (player.getX() == other.getX() && player.getY() == other.getY()) {
                System.out.println("zbicie");
            }
        }
    }



public void beat(){

}


public String readMoveInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Tell me want you want to do. (For example: a2a3)");
    String myMove = scanner.next();
    return myMove;
}


/*
//jedna metoda do odczytywania i jedna do przekazywania
//musimy zinterpretować komende np a2a3 (string) na x1,y1 oraz x2, y2 (int)
//metoda czy poprawny ruch



public int[] readCords(String input) {
    if (input.length() != 2) {
        System.out.println("Invalid input format. Please use the format 'a2'.");
        return null; //todo rzucenie wyjątku
    }
    char xChar = input.charAt(0);
    int y = Character.getNumericValue(input.charAt(1));

    int x = xChar - 'a';
    y = HEIGHT - y;
    return new int[]{x, y};


        /*
        if (input.length() == 2) {
            char xChar = input.charAt(0);
            int y = Character.getNumericValue(input.charAt(1));

            int x = xChar - 'a';
            y = HEIGHT - y;
            return new int[]{x, y};
        } else {
            System.out.println("Invalid input format. Please use the format 'a2'.");
            return null; //todo rzucenie wyjątku
        }

         
}

public Figure getFigure(int x, int y) {
    for (Figure figure : figures) {
        if (figure.getX() == x && figure.getY() == y) {
            return figure;
        }
    }
    return null;
}
}


//todo pilnować planszy - nie ma mozliwosci ruchui poza plansze

 */