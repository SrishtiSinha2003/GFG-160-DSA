import java.util.Arrays;

public class MinimizeTheHeight {
    // Function to get the minimum difference between heights after modifying
    public static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) return 0;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        int small = arr[0] + k;
        int big = arr[n - 1] - k;

        if (small > big) {
            int temp = small;
            small = big;
            big = temp;
        }

        for (int i = 1; i < n - 1; i++) {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            if (subtract >= small || add <= big)
                continue;

            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }

        return Math.min(ans, big - small);
    }

    public static void main(String[] args) {
        int[] arr = {1, 15, 10};
        int k = 6;
        int n = arr.length;
        System.out.println("Minimum difference is " + getMinDiff(arr, n, k));
    }
}