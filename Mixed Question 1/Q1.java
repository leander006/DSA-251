import java.util.* ;
import java.io.*;
class Q1 { 
    public static boolean areAnagram(String str1, String str2){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i), 1)+1);
        }

        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i), map.get(str2.charAt(i) -1));
            }
        }

        for(Map.Entry m: map.entrySet()){
            if(m.getValue() != null){
                return false;
            }
        }
        return true;
    }
}