package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.createFigures();
//        Scanner scanner = new Scanner(System.in);
        System.out.println(board.composeBoardView());
//        System.out.println("Przeanalizuj stan planszy i naciśnij enter");
//        scanner.nextLine();
        board.move();
        System.out.println(board.composeBoardView());

    }
}