import java.util.* ;
import java.io.*; 
class Q3 {
      // Space complexity: O(1)
      	public static int minimumParentheses(String pattern) {
		// To store count of "("
		int openBr = 0;

		// To store count of ")"
		int closeBr = 0;

		// Count of minimum parentheses required
		int count = 0;

		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) == '(') {
				openBr += 1;
			} else {
				closeBr += 1;
			}

			// If ")" is greater than "("
			if (closeBr > openBr) {
				count += (closeBr - openBr);
				openBr = 0;
				closeBr = 0;
			}
		}

		count += (openBr - closeBr);

		return count;
	}
      
	public static int minimumParentheses(String pattern) {
		// Write your code here.
		Stack<Character> s = new Stack<>();
		for(int i=0;i<pattern.length() ;i++){
			if((s.isEmpty() && pattern.charAt(i) == '(' ) ){
				s.push('(');
			}
			else if((s.isEmpty() && pattern.charAt(i) == ')' ) ){
				s.push(')');
			}			
			else if(!s.isEmpty() && pattern.charAt(i) == ')' ){
				if(s.peek() ==  '('){
					s.pop();
				}
				else{
				// System.out.print("s.pop()_"+s.peek()+"_");	
					s.push(')');
				}
			}
			else if(!s.isEmpty() && pattern.charAt(i) == '(' ){
				s.push('(');
			}			
		}

		return s.size();
	}

      // Space complexity: O(n)
}