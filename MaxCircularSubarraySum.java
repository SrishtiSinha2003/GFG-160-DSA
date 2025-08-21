public class MaxCircularSubarraySum {
  static int maxCircularSubarraySum(int[] arr) {
      int maxKadane = KadanesAlgo.maxSubarraySum(arr);
      int arraySum = 0;
      for (int i = 0; i < arr.length; i++) {
          arraySum += arr[i];
          arr[i] = -arr[i];
      }
      int maxWrap = arraySum + KadanesAlgo.maxSubarraySum(arr);
      return Math.max(maxKadane, maxWrap);
  }
}
