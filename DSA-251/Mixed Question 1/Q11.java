import java.io.*;
import java.util.* ;

class Q11 {

      // We solved
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int res=0;
        int n=1;
        Arrays.sort(arr);
        if(N == 2 && arr[0] == arr[1]){
            return 1;
        }
        for(int i=0;i<N-1;i++){
            if(arr[i] == (arr[i+1] -1)){
                n++;
            }
            else if(arr[i] == arr[i+1]){
                continue;
            }
            else{
                res=Math.max(res, n);
                n=1;
            } 
        }
        res=Math.max(res, n);
        return res;
    }

    /*  
    Time Complexity: O(N)
    Space Complexity: O(N)

    Where N is the length of the given array.
    */

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // To store length of longest consecutive sequence.
        int mx = 0;

        // To store the length of current consecutive Sequence.
        int count = 0;

        // To store all the unique elements of array.
        HashSet<Integer> set = new HashSet<>();

        for (Integer element : arr) {
            set.add(element);
        }

        for (Integer element : arr) {
            int previousConsecutiveElement = element - 1;

            if (!set.contains(previousConsecutiveElement)) {

                // Element is the first value of consecutive sequence.
                int j = element;
                
                while (set.contains(j)) {
                    // The next consecutive element by will be j + 1.
                    j++;
                }

                // Update maximum length of consecutive sequence.
                mx = Math.max(mx, j - element);
            }

        }

        return mx;
    }

}