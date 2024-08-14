package edu.miu.cs.cs425;

public class Main {
    public static void main(String[] args) {


        int [][] input = {{1, 2}, {3, 4}, {5, 6}};
        ArrayFlattner flattner = new ArrayFlattner();
        System.out.println(" flattner++++!" + flattner.flatten(input));
    }
}