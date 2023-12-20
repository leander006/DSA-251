import java.util.* ;
import java.io.*; 
class Q5 {
	public static int[][] rotateMatRight(int[][] arr, int n, int m, int k) {
		int res[][] = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				res[i][(j+k) % m] = arr[i][j];
			}
		}

		return res;
	}

}