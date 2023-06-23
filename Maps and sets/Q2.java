import java.io.*;
import java.util.* ;
class Q2 {

	public static char firstNonRepeatingCharacter(String str) {
		HashMap<Character,Integer> map = new HashMap<>();

		for(int i=0;i<str.length();i++){
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
		}
		


		for(int i=0;i<str.length();i++){
			if( map.get(str.charAt(i)) == 1){
				return str.charAt(i);
			}
		}
		return str.charAt(0);
	}

}
