

class Q2 {

    public static int[] separateNegativeAndPositive(int a[]) {
        for(int i=0,j=1;i<a.length && j<a.length;){
            if((a[i] >0 ) && (a[j] <0)){
                int m=i,n=j;
                int temp = a[m];
                a[m]= a[n];
                a[n] =temp;
                i++;
                j++;
            }
            else if((a[i] < 0 ) && (a[j] < 0)){
                i++;
                j++;
            }
            else if((a[i] < 0) && (a[j] > 0 )){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return a;
    }
}