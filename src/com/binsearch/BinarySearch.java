package com.binsearch;

public class BinarySearch {

    private static boolean isArrayValid(int[] array) {
        return array != null && array.length > 0;
    }

    public static boolean binarySearch(int[] array, int k) {
        return isArrayValid(array) ? binarySearch(0, array.length - 1, k, array) : false;
    }

    private static boolean binarySearch(int left, int right, int k, int[] arr) {
        if (left > right) {
            return false;
        }
        int middleIndex = (left + right) / 2;
        int middle = arr[middleIndex];
        if (middle == k) {
            return true;
        } else if (k < middle) {
            return binarySearch(left, middleIndex - 1, k, arr);
        } else {
            return binarySearch(middleIndex + 1, right, k, arr);
        }
    }

    private static boolean binarySearchLoop(int left, int right, int k, int[] arr) {
        while (left <= right) {
            int middleIndex = (left + right) / 2;
            if (k == arr[middleIndex]) {
                return true;
            } else if (k < arr[middleIndex]) {
                right = middleIndex - 1;
            } else {
                left = middleIndex + 1;
            }
        }
        return false;
    }

    public static boolean binarySearchLoop(int[] array, int k) {
        return isArrayValid(array) ? binarySearchLoop(0, array.length - 1, k, array) : false;
    }

}
