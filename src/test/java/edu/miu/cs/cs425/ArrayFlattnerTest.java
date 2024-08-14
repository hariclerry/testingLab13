package edu.miu.cs.cs425;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayFlattnerTest {

    @Test
    public void testResultIsCorrect() {
        int [][] input = {{1, 2}, {3, 4}, {5, 6}};
        int [] expectedOutput = {1, 2, 3, 4, 5, 6};
        ArrayFlattner flattener = new ArrayFlattner();
        int [] actualOutput = flattener.flatten(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWhenInputIsNull() {
        int [][] input = null;
        ArrayFlattner flattener = new ArrayFlattner();
        int [] actualOutput = flattener.flatten(input);
        assertNull(actualOutput);
    }
}