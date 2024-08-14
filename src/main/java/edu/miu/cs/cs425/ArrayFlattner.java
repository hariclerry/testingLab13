package edu.miu.cs.cs425;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayFlattner {

    public int [] flatten(int [][] arr) {
        if (arr == null) return null;

        return Arrays.stream(arr)
                     .flatMapToInt(Arrays::stream)
                     .toArray();
    }


}
