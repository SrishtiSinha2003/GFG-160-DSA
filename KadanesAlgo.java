public class KadanesAlgo {
    static int maxSubarraySum(int [] arr) {
        int maxSoFar = arr[0]; //result
        int currMax = arr[0]; //maxEnding
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
