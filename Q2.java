import java.util.* ;
import java.io.*; 
class Q2 {
	
	public static void main(String args[]) {
		Scanner l = new Scanner(System.in);
		int n = l.nextInt();
		int arr[] = new int[n];
		int d=0;
		for(int i=0;i<n;i++){
				arr[i] = l.nextInt();
		}

		int k=l.nextInt();
		int temp[]= new int[k];
		for(int i=0;i<k;i++){
			temp[i] = arr[i];
		}
		// for(int i=0;i<temp.length;i++){
		// 	System.out.print("i "+i+temp[i]+" ");
		// }
			System.out.println();		
		for(int j=k;j<arr.length;j++){
			arr[d] = arr[j];
			d++;
		}			
		// for(int i=0;i<arr.length;i++){
		// 	System.out.print(arr[i]+" ");
		// }	
		// 			System.out.println("D "+d);	
		for(int i=0;i<temp.length;i++){				
			arr[d] = temp[i];
			d++;
		}
					// System.out.println();	
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}