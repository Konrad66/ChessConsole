package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTestSuite {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
        board.createFigures();
    }

    @Test
    public void locationPawnTest() {
        Figure pawn = new Figure("T", 0, 5, Color.WHITE);

        assertEquals(0, pawn.getX());
        assertEquals(5, pawn.getY());
    }

    @Test
    public void testFigureColor() {
        Figure whiteFigure = new Figure("T", 3, 5, Color.WHITE);
        Figure blackFigure = new Figure("T", 3, 2, Color.BLACK);

        assertEquals("T", whiteFigure.getName());
        assertEquals("t", blackFigure.getName());
    }
}