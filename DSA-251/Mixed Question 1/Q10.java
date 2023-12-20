/* 
    Time Complexity : O(N)
    Space Complexity : O(1)

    Where N is the number of elements in the ARR.
*/
class Q10 {
    public static int maxSubarraySum(int[] arr, int n) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < n; ++i) {
            totalSum = totalSum + arr[i];
            curr = curr + arr[i];

            if (curr > maxSum) {
                maxSum = curr;
            }

            if (curr < 0) {
                curr = 0;
            }
        }

        int minSum = Integer.MAX_VALUE;
        curr = 0;

        for (int i = 0; i < n; ++i) {
            curr = curr + arr[i];

            if (curr < minSum) {
                minSum = curr;
            }

            if (curr > 0) {
                curr = 0;
            }
        } 

        if (totalSum == minSum) {
            return maxSum;
        }

        return Math.max(totalSum - minSum, maxSum);
    }

}