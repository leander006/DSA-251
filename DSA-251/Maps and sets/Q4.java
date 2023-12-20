import java.util.*;
class Q4 {
      public static int subArrayCount(ArrayList < Integer > arr, int k) {
      	// HashMap to store frequency.
    HashMap < Integer, Integer > remMap = new HashMap < > (); 
    
    // Add base case in hashmap.
    remMap.put(0, 1); 

    int count = 0;
    long summ = 0;
    for (int i = 0; i < arr.size(); i++) {
      summ += arr.get(i);
      int rem = (int)(((summ % k) + k) % k);

      // If rem already in 'remMap'.
      if (remMap.containsKey(rem)) {
        count += remMap.get(rem);
        remMap.put(rem, remMap.get(rem) + 1);
      } else {
        remMap.put(rem, 1);
      }
    }

    
    return count;
}
}