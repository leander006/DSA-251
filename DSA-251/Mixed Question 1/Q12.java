import java.util.* ;

import java.io.*; 
class Q12 {
	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
		long sum=Integer.MIN_VALUE;
		long cs =0;
		for (int i = 0; i <(n*k) ; i++) {
			cs+= arr.get(i%(n));
			sum= Math.max(cs, sum);
			if(cs<0){
				cs=0;
			}
		}
		return sum;
	}
}