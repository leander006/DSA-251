import java.util.* ;
import java.io.*; 
class EquilibriumIndex {
	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int prefixSum[]=new int [arr.length],suffixSum[]=new int [arr.length];
		prefixSum[0] = arr[0];
		suffixSum[arr.length-1]=arr[arr.length-1];
		for(int i=1;i<arr.length;i++){
				prefixSum[i]=arr[i]+prefixSum[i-1];
		}
		for(int i=arr.length-2;i>=0;i--){
			suffixSum[i] = arr[i]+suffixSum[i+1];
		}

		for(int i=0;i<arr.length;i++){
			if((prefixSum[i]-suffixSum[i]) == 0){
				return i;
			}
		}
		return -1;	
	}

}