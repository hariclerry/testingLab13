package edu.miu.cs.cs425;

import edu.miu.cs.cs425.service.ArrayFlattenerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class ArrayReversorTest {

    AutoCloseable openMocks;

    @InjectMocks
    private ArrayReversor arrayReversor;

    @Mock
    private ArrayFlattenerService arrayFlattenerService;


    @BeforeEach
    public void setUp() {
        openMocks = MockitoAnnotations.openMocks(this);
    }

        @AfterEach
        public void tearDown() throws Exception {
            openMocks.close();

        }

        @Test
        public void reverseArrayTestThatResultIsCorrect() {
            int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
            int[] flattenedArray = {1, 3, 0, 4, 5, 9};
            int[] expectedReversedArray = {9, 5, 4, 0, 3, 1};

            when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(flattenedArray);

            int[] result = arrayReversor.reverseArray(inputArray);

            assertArrayEquals(expectedReversedArray, result);
        }

    @Test
    public void reverseArrayTestWhenInputIsNull() {
        int[][] inputArray = null;

        when(arrayFlattenerService.flattenArray(null)).thenReturn(null);

        int[] result = arrayReversor.reverseArray(inputArray);

        verify(arrayFlattenerService).flattenArray(null);
        assertNull(result);
    }
}