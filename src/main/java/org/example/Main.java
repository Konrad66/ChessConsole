package org.example;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.createFigures();
        System.out.println(board.composeBoardView());
        board.move();
    }
}