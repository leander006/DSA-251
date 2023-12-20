import java.util.Scanner;
class Q1 {
    static String reverseStringWordWise(String input) {
        String res="";
        int prev=input.length();
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i) == ' '){
                res+=input.substring(i+1,prev);
                res+=" "; 
                prev=i;
            }
        }
        res+=input.substring(0,prev);
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
 
}