class Q6 {
    
//     Time Complexity: O(N)
//     Space Complexity: O(1)
      public class Solution {

	public static int findMajority(int[] arr, int n) {
		// Variable to store the majority element in the array, it it is present.
		int majorityElement = -1;
		int count = 0;

		// Iterating the array to know if there is a possible majority element present.
		for (int i = 0; i < n; i++) {
			// If count becomes 0, set current element as a possible candidate for majority element, reset count to 1.
			if (count == 0) {
				majorityElement = arr[i];
				count = 1;
				continue;
			}

			// Increment the count if the current element of the array is equal to the current majority element, else decrement it.
			if (arr[i] == majorityElement) {
				count++;
			} else {
				count--;
			}
		}

		count = 0;

		// Checking if majority element occurs more than 'n' / 2 times.
		for (int i = 0; i < n; i++) {
			if (arr[i] == majorityElement) {
				count++;
			}
		}

		// If the count of the majority element is greater than 'n' / 2, then return it.
		if (count > n / 2) {
			return majorityElement;
		}

		// If no majority element found, return -1.
		return -1;
	}

      }

//     Time Complexity: O(N)
//     Space Complexity: O(N) since used map

      public class Solution {
	public static int findMajority(int[] arr, int n) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry m :map.entrySet()){
			if((int)m.getValue() >n/2){
				return (int)m.getKey();
			}
		}
		return -1;
	}

}