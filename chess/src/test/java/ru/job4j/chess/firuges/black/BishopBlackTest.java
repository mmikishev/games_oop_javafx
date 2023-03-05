package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell expected = bishopBlack.position();
        Cell actual = Cell.C8;
        assertEquals(expected, actual);
    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure actual = bishopBlack.copy(Cell.C5);
        Cell actualPos = actual.position();
        assertEquals(Cell.C5, actualPos);
    }

    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, actual);
    }
}