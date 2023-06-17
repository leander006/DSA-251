import java.util.* ;
import java.io.*; 

class NonDecresingArray {
	public static boolean isPossible(int[] arr, int n) {
		int notInIndex =-1;

		for(int i=0;i<n-1;i++){
			if((arr[i] > arr[i+1])){
					if(notInIndex != -1){
						return false;
					}
				notInIndex =i;	
			}
		}

		if(notInIndex == -1 || notInIndex == 0 || notInIndex == n-2){
			return true;
		}

		if(arr[notInIndex -1] <= arr[notInIndex +1]){
			return true;
		}

		if(arr[notInIndex] <= arr[notInIndex +2]){
			return true;
		}

		return false;

	}



}