import java.util.* ;
import java.io.*; 
class Q5 {
	public static String nextLargestPalindrome(String number, int length) {
        char[] arr = number.toCharArray();
        
        // Check if all digits are '9'
        boolean allNines = true;
        for (char c : arr) {
            if (c != '9') {
                allNines = false;
                break;
            }
        }
        
        if (allNines) {
            // If all digits are '9', return '1' followed by (length-1) number of '0's followed by '1'
            StringBuilder sb = new StringBuilder();
            sb.append('1');
            for (int i = 0; i < length - 1; i++) {
                sb.append('0');
            }
            sb.append('1');
            return sb.toString();
        }
        
        boolean leftSmaller = false;
        int mid = length / 2;
        int i = mid - 1;
        int j = (length % 2 == 0) ? mid : mid + 1;
        
        // Ignore the same middle character for odd-length strings
        while (i >= 0 && arr[i] == arr[j]) {
            i--;
            j++;
        }
        
        // Check if the left half is smaller than the right half
        if (i < 0 || arr[i] < arr[j]) {
            leftSmaller = true;
        }
        
        // Copy the left half to the right half
        while (i >= 0) {
            arr[j] = arr[i];
            i--;
            j++;
        }
        
        // Handle the case when left half is smaller
        if (leftSmaller) {
            int carry = 1;
            i = mid - 1;
            
            // Adjust digits to create the smallest palindrome
            if (length % 2 == 1) {
                int num = arr[mid] - '0' + carry;
                carry = num / 10;
                arr[mid] = (char) (num % 10 + '0');
                j = mid + 1;
            } else {
                j = mid;
            }
            
            // Propagate the carry towards the high-order digits
            while (i >= 0 && carry > 0) {
                int num = arr[i] - '0' + carry;
                carry = num / 10;
                arr[i] = (char) (num % 10 + '0');
                arr[j] = arr[i];
                i--;
                j++;
            }
        }
        
        return String.valueOf(arr);
    
	}

}