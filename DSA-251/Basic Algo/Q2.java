import java.util.* ;
import java.io.*; 
class Q2 {
	public static void selectionSort(int arr[], int n) {
		for(int i=0;i<n;i++){
			int minEle =i;
			for(int j=i+1;j<n;j++){
				if(arr[j] < arr[minEle]){
						minEle = j;
				}
			}
			int temp = arr[minEle];
			arr[minEle]= arr[i];
			arr[i]=temp;
		}
	}
}