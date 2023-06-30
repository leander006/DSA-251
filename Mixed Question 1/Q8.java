import java.util.*;
class Q8 {
    /*
	Time Complexity : O(N * log(N))
	Space Complexity : O(1),

	where N is the number of elements in the array.

*/

	public static ArrayList<Integer> findTriplets(int[] arr, int n) 
    {

		ArrayList<Integer> ans = new ArrayList<>();

		// Sorting the arr.
		Arrays.sort(arr);

		for (int i = n - 1; i >= 0; i--) 
        {

			int j = 0;
			int k = i - 1;

			// Use two pointer technique to find the required triplet.
			while (j < k) 
            {

				// If we find a valid triplet.
				if (arr[i] == arr[j] + arr[k]) 
                {
					ans.add(arr[i]);
					ans.add(arr[j]);
					ans.add(arr[k]);
					return ans;
				}

				// If the current element is greater than the sum of the other two, increment j.
				else if (arr[i] > arr[j] + arr[k]) 
                {
					j = j + 1;
				}

				// If the current element is smaller than the sum of the other two, decrement k.
				else 
                {
					k = k - 1;
				}
			}
		}
		return ans;
	}
}