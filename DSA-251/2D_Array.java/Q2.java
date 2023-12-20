import java.util.* ;
import java.io.*; 
class Q2 {

    public static boolean isMatrixSymmetric(int[][] matrix) {

        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    newMatrix[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j] != newMatrix[i][j]){
                        return false;
                    }
            }
        }
        return true;
    }

}
