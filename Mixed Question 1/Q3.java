import java.util.*;
class Q3 {
    /*
    Time Complexity: O(N)
    Space Complexity: O(1)
    */

      public class Solution {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        int n = arr.size();

        // Array for storing final answer.
        ArrayList<Integer> majorityElement=new ArrayList<Integer> ();

        // Variables for storing the elements which may occur more than n/3 times.
        int firstCandidate = 0, secondCandidate = 0;

        // Variables for storing the frequency of the candidate elements.
        int firstCount = 0, secondCount = 0;

        // Iterate through the array.
        for (int i = 0; i < n; i++) {
            // Increment firstCount if the current element is equal to firstCandidate.
            if (arr.get(i) == firstCandidate) {
                firstCount = firstCount + 1;
            }

            // Increment secondCount if the current element is equal to secondCandidate.
            else if (arr.get(i) == secondCandidate) {
                secondCount = secondCount + 1;
            }
            // Change value of the firstCandidate to the current element if firstCount is equal to 0.
            else if (firstCount == 0) {
                firstCandidate = arr.get(i);
                firstCount = 1;
            }

            // Change value of the secondCandidate to the current element if secondCount is equal to 0.
            else if (secondCount == 0) {
                secondCandidate = arr.get(i);
                secondCount = 1;
            }

            // Otherwise decrement firstCount and secondCount by 1.
            else {
                firstCount = firstCount - 1;
                secondCount = secondCount - 1;
            }
        }

        firstCount = 0;
        secondCount = 0;

        // Iterate through the array to find frequency of firstCandidate and secondCandidate.
        for (int i = 0; i < n; i++) {
            // Increment firstCount if the current element is equal to firstCandidate.
            if (arr.get(i) == firstCandidate) {
                firstCount = firstCount + 1;
            }

            // Increment secondCount if the current element is equal to secondCandidate.
            else if (arr.get(i) == secondCandidate) {
                secondCount = secondCount + 1;
            }
        }

        // Include firstCandidate in the answer if its frequency is more than n/3.
        if (firstCount > n / 3) {
            majorityElement.add(firstCandidate);
        }

        // Include secondCandidate in the answer if its frequency is more than n/3.
        if (secondCount > n / 3) {
            majorityElement.add(secondCandidate);
        }

        // Return all stored majority elements.
        return majorityElement;

    }
      }

       /*   
       Time Complexity: O(N)
       Space Complexity: O(N)
      */

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size() ;i++){
            map.put(arr.get(i),map.getOrDefault(arr.get(i), 0)+1);
        }

        for(Map.Entry m :map.entrySet()){
                if((int)m.getValue() >(arr.size()/3)){
                    ans.add((int)m.getKey());
                }
        }
        
        return ans;
    }
}