import java.util.* ;
import java.io.*; 
class Q2 {

	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m){
			ArrayList<Integer> res = new ArrayList<>();
			int i=0,j=0;
			while(i<n && j<m){
				if(arr1.get(i).equals(arr2.get(j)) ){
					res.add(arr1.get(i));
					i++;
					j++;
				}
				else if(arr1.get(i) < arr2.get(j)){
					i++;
				}
				else{
					j++;
				}
			}
			if(res.isEmpty()){
				res.add(-1);
			}
			return res;
	}
}