import java.util.ArrayList;
class Q7 {
	public static void pushZerosAtEnd(ArrayList<Integer> arr){
		for(int i=0,j=1;i<arr.size() && j<arr.size() ;){
			if(arr.get(i) == 0 && arr.get(j) != 0){
				int temp=arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, temp);
				i++;
				j++;
			}
			else if(arr.get(i) == 0 && arr.get(j) == 0){
				j++;
			}
			else{
				i++;
				j++;
			}
		}
	}
}