package com.binsearch;

public class BinarySearch {

    public static boolean binarySearch(int[] array, int k) {
        if (array == null || array.length == 0) {
            return false;
        }
        return binarySearch(0, array.length - 1, k, array);
    }

    private static boolean binarySearch(int left, int right, int k, int[] arr) {
        int middleIndex = (left + right) / 2;
        int middle = arr[middleIndex];
        if (left > right) {
            return false;
        }
        if (middle == k) {
            return true;
        } else if (k < middle) {
            return binarySearch(left, middleIndex - 1, k, arr);
        } else {
            return binarySearch(middleIndex + 1, right, k, arr);
        }
    }

}
