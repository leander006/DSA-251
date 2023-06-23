
import java.util.* ;
import java.io.*;

class Q1 { 
	public static int minElementsToRemove(ArrayList<Integer> arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.size();i++){
			map.put(arr.get(i),map.getOrDefault(arr.get(i), 1)+1);
		}

		return (arr.size() - map.size());
		
	}

}