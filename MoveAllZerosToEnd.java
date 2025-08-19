/*
 * MoveAllZerosToEnd.java
 * This class contains a method to move all zeros in an array to the end while maintaining the order of non-zero elements.
 * 
 * You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
 */

public class MoveAllZerosToEnd {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill the remaining array with zeros
        while (count < n) {
            arr[count++] = 0;
        }
    }
}
