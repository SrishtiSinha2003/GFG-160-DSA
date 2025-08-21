public class MaxProduct {
    static int maxProductSubarray(int[] arr) {
        int maxSoFar = arr[0]; // result
        int currMax = arr[0]; // maxEnding
        int currMin = arr[0]; // minEnding
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap max and min when multiplying by a negative
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(arr[i], currMax * arr[i]);
            currMin = Math.min(arr[i], currMin * arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
