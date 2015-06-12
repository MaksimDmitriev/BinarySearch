package com.binsearch;

public class Main {

    public static void main(String[] args) {
        int n = 1000000;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println(BinarySearch.binarySearch(array, 0));
        System.out.println(BinarySearch.binarySearchLoop(array, 0));
    }
}
