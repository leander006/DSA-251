import java.util.* ;
import java.io.*; 

class Q4{
	public static String isSubsequence(String str1, String str2) { 
		int pt1=0;
		int pt2=0;
		int count =0;
		while(pt1 < str1.length() && pt2 < str2.length()){
			if(str1.charAt(pt1) == str2.charAt(pt2)){
				pt1++;
				pt2++;
				count++;
			}
			else{
				pt2++;
			}
		}
		return count == str1.length() ? "True" :"False";
	}
}