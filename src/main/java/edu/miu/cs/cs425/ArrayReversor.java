package edu.miu.cs.cs425;

import edu.miu.cs.cs425.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] inputArray) {
        if (inputArray == null) {
            return null;
        }

        int[] flattenedArray = arrayFlattenerService.flattenArray(inputArray);

        if (flattenedArray == null) {
            return null;
        }

        int[] reversedArray = new int[flattenedArray.length];
        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - i - 1];
        }
        return reversedArray;
    }


}
