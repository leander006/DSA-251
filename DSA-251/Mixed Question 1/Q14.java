class Q14 {
    public static String multiplyStrings(String a, String b) {
        if(a.equals("0")||b.equals("0")) return "0";
        int n=a.length();
        int m=b.length();
        int arr[]=new int[n+m];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int d1=b.charAt(i)-'0';
                int d2=a.charAt(j)-'0';
                int res=d1*d2+arr[i+j];
                arr[i+j]=res;
            }
        }
        StringBuilder sb=new StringBuilder();
        int carry=0;
        for(int i=n+m-2;i>=0;i--){
            int d=arr[i]+carry;
            sb.append(d%10);
            carry=d/10;
        }
        while(carry>0){
            sb.append(carry%10);
            carry/=10;
        }
        return sb.reverse().toString();
    }

}