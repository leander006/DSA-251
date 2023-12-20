class Q4 {
    /*
    Time Complexity: O(N * M) 
    Space Complexity: O(N + M) 
    */
	public static void setZeros(int matrix[][]) {

		// Storing dimensions of matrix in n and m.
		int n = matrix.length;
		int m = matrix[0].length;

		// Declaring two boolean arrays colZero and rowZero.
		Boolean colZero[] = new Boolean[m];
		Boolean rowZero[] = new Boolean[n];
		for (int i = 0; i < m; i++) {
			colZero[i] = false;
		}
		for (int i = 0; i < n; i++) {
			rowZero[i] = false;
		}

		// Traversing the original matrix and filling values for rowZero and calZero.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) {
					colZero[j] = rowZero[i] = true;
				}
			}
		}

		// Traversing the original matrix and changing values of matrix according to
		// rowZero and colZero.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (rowZero[i] || colZero[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}

      /*
    Time Complexity: O(N * M) 
    Space Complexity:O(1) 
    */

//     public static void setZeros(int matrix[][]) {

//         // Storing dimensions of matrix in n and m.
//         int n = matrix.length;
//         int m = matrix[0].length;

//         // Declaring two boolean variables firstColZero and firstRowZero.
//         Boolean firstColZero = false, firstRowZero = false;

//         // Setting firstColZero to true if any element in first column is zero.
//         for (int i = 0; i < n; i++) {
//             if (matrix[i][0] == 0) {
//                 firstColZero = true;
//                 break;
//             }
//         }

//         // Setting firstRowZero to true if any element in first row is zero.
//         for (int j = 0; j < m; j++) {
//             if (matrix[0][j] == 0) {
//                 firstRowZero = true;
//                 break;
//             }
//         }

//         // Setting values for each row and column to be zero or not.
//         for (int i = 1; i < n; i++) {
//             for (int j = 1; j < m; j++) {
//                 if (matrix[i][j] == 0) {
//                     matrix[i][0] = matrix[0][j] = 0;
//                 }
//             }
//         }

//         // If any element of first row is zero then that complete column should be zero
//         // and vice-versa.
//         for (int i = 1; i < n; i++) {
//             for (int j = 1; j < m; j++) {
//                 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         // Setting first row to zero if firstRowZero is true.
//         if (firstColZero) {
//             for (int i = 0; i < n; i++) {
//                 matrix[i][0] = 0;
//             }
//         }

//         // Setting first column to zero if firstColZero is true.
//         if (firstRowZero) {
//             for (int j = 0; j < m; j++) {
//                 matrix[0][j] = 0;
//             }
//         }
//     }

      /*
      Time Complexity: O(N * M*K) 
      Space Complexity: O(N + M) 
      */

       public static void setZeros(int matrix[][]) {
        int mem[][] = new int[matrix.length][(matrix[0].length)];
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                    mem[i][j]=matrix[i][j];
             }            
         }
        for(int i=0;i<mem.length;i++){
            for(int j=0;j<mem[0].length;j++){
                        int newI =i,newJ=j;
                    if(mem[i][j] ==0){
                        while(newJ<matrix[0].length){
                            matrix[newI][newJ++]=0;
                        }
                        newI=i;
                        newJ=j;
                        while(newJ>=0){
                            matrix[newI][newJ--]=0;
                        }
                        newI=i;
                        newJ=j;
                        while(newI>=0){
                        matrix[newI--][newJ]=0;
                        }
                        newI=i;
                        newJ=j;
                        while(newI<matrix.length){
                            matrix[newI++][newJ]=0;
                        }
                    }
            }
        }
    }

}
