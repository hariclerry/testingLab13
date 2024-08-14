package edu.miu.cs.cs425.service;

import edu.miu.cs.cs425.ArrayFlattner;

public class ArrayFlattenerServiceImpl implements ArrayFlattenerService {
    @Override
    public int[] flattenArray(int[][] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }
        ArrayFlattner arrayFlattner = new ArrayFlattner();
        return arrayFlattner.flatten(inputArray);
    }
}
