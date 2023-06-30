/*
	Time Complexity  : O(log(N))
	Space Complexity : O(1)

	Where N is the total number of elements in the given array.
*/

import java.util.ArrayList;
class Q3 {
    public static int singleNonDuplicate(ArrayList < Integer > arr) {
        int n = arr.size();
        int low = 0, high = n - 1, mid;

        // Do binary search
        while (low < high) {

            // Calculate mid
            mid = (low + high) / 2;

            // Update low and high.
            if (mid % 2 == 1) {

                int a = arr.get(mid);
                int b = arr.get(mid - 1);

                if (a == b) {
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }
            else if (mid % 2 == 0) {

                int a = arr.get(mid);
                int b = arr.get(mid + 1);

                if (a == b) {
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }
        }

        return arr.get(low);
    }
}
