import java.util.Arrays;
/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
*/
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        
        Arrays.sort(arr);
        
        for(int i=n-2; i>=0; i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
}
