    import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
/*
    Time Complexity O(N^2)
    Space Complexity: O(N^2)

    where N  is the number of rows in the square matrix ARR.
*/


class Q15 {

	public static ArrayList<ArrayList<Integer>> sumOfKxKMatrices(ArrayList<ArrayList<Integer>> arr, int k) {

		ArrayList<ArrayList<Integer>>res = new ArrayList<>();
		int n = arr.size();
		for(int i=0;i<=n-k;i++){
		ArrayList<Integer>row = new ArrayList<>();	
			for(int j=0;j<=n-k;j++){
				int sum=0;
				for(int p=i;p<i+k;p++){
					for(int q =j ;q<j+k;q++){
						sum+=arr.get(p).get(q);
					}
				}
				row.add(sum);				
			}
			res.add(row);
		}
		return res;
	}
      
      public static ArrayList<ArrayList<Integer>> sumOfKxKMatrices(ArrayList<ArrayList<Integer>> arr, int k) {

		int n = arr.size();

		ArrayList<ArrayList<Integer> > prefix = new ArrayList<ArrayList<Integer> >(n + 1);

		for (int i = 0; i < n + 1; i++) {
			prefix.add(new ArrayList<Integer>(n + 1));

			for (int j = 0; j < n + 1; j++) {
				prefix.get(i).add(0);
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				prefix.get(i).set(j, prefix.get(i - 1).get(j) + prefix.get(i).get(j - 1) - prefix.get(i - 1).get(j - 1) + arr.get(i - 1).get(j - 1));
			}
		}


		// This Matrix stores the final answer.
		ArrayList<ArrayList<Integer> > ans = new ArrayList<ArrayList<Integer>> (n - k + 1);

		for (int i = 0; i < n - k + 1; i++) {
			ans.add(new ArrayList<Integer>(n - k + 1));
			for (int j = 0; j < n - k + 1; j++) {
				ans.get(i).add(0);
			}
		}

		for (int i = 1; i <= n - k + 1; i++) {

			for (int j = 1; j <= n - k + 1; j++) {
				ans.get(i - 1).set(j - 1, prefix.get(i + k - 1).get(j + k - 1) - prefix.get(i - 1).get(j + k - 1) - prefix.get(i + k - 1).get(j - 1) + prefix.get(i - 1).get(j - 1));


			}

		}

		return ans;
	}

}