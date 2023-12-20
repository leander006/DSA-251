import java.util.ArrayList;
class Q16 {
    /*

	Time complexity: O(N)
	Space complexity: O(1)

	Where N is the length of the given array.

*/

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {

        int r = 0, m = 0;

        // Traversing the array
        for (int i = 0; i < n; i += 1) {
            if (arr.get(Math.abs(arr.get(i)) - 1) > 0) {

                int x = Math.abs(arr.get(i));

                arr.set(x - 1, -arr.get(x - 1));
            }
            // If arr[i] is already negative, it is the repeating number
            else {
                r = Math.abs(arr.get(i));
            }
        }

        for (int i = 0; i < n; i += 1) {
            // The index at which the element is positive is the missing number
            if (arr.get(i) > 0) {
                m = i + 1;
                break;
            }
        }

        int[] ans = new int[]{m, r};

        return ans;
    }


}