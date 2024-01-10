package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTestSuite {


    //TODO zrobić test parametryzowany oraz uporządkować odpowiendnio testy
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
        board.createFigures();
    }

    @Test
    public void testCreateFigure() {
        Figure tower = board.getFigure(0, 7);
        Figure king = board.getFigure(4, 0);
        Figure none = board.getFigure(0, 3);

        assertEquals("T", tower.getName());
        assertEquals(Color.WHITE, tower.getColor());

        assertEquals("k", king.getName());
        assertEquals(Color.BLACK, king.getColor());

        assertNull(none);
    }
}