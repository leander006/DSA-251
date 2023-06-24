import java.util.* ;
import java.io.*; 
class Q1 {
    public static int pairSum(int arr[], int n, int target) {
        int count =0;
        for(int i=0,j=arr.length-1;i<j;){
            if((arr[i]  + arr[j]) == target){
                count++;
                i++;
                j--;
            }
            else if((arr[i]  + arr[j]) > target){
                j--;
            }
            else{
                i++;
            }
        }
        return count  == 0 ? -1:count;
    }

}