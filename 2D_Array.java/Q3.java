class Q3m {
    /*
    Time Complexity: O(N^2)
    Space Complexity: O(1)

    where N is the side length of the given square matrix.
*/
public static void inplaceRotate(int[][] inputArray, int n) {
        transpose(inputArray);
        reverseColumns(inputArray);
    }

    public static void reverseColumns(int inputArray[][]) {
        for (int i = 0; i < inputArray[0].length; i++) {

            for (int j = 0, k = inputArray[0].length - 1; j < k; j++, k--) {
                int temp = inputArray[j][i];
                inputArray[j][i] = inputArray[k][i];
                inputArray[k][i] = temp;
            }
        }
    }

    public static void transpose(int inputArray[][]) {
        for (int i = 0; i < inputArray.length; i++) {

            for (int j = i; j < inputArray[0].length; j++) {
                int temp = inputArray[j][i];
                inputArray[j][i] = inputArray[i][j];
                inputArray[i][j] = temp;
            }
        }
    }
}

