class Solution {
    public int maxCircularSum(int arr[]) {
        int totalSum = 0;
        int maxNormal = kadane(arr);
        
        // Edge case: all numbers are negative
        if (maxNormal < 0) return maxNormal;
        
        int minSubarraySum = 0;
        int currMin = 0;
        
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSubarraySum = Math.min(minSubarraySum, currMin);
        }
        
        int maxCircular = totalSum - minSubarraySum;
        return Math.max(maxNormal, maxCircular);
    }
    
    // Kadane's Algorithm for max subarray sum
    private int kadane(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}