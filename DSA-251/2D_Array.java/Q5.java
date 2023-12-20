class Q5 {
	public static void spiralPrint(int matrix[][]){
		if(matrix.length == 0 || matrix[0].length ==0){
			System.out.print(" ");
			return;
		}
		int startRow =0,startCol=0,endRow=matrix.length-1,endCol=matrix[0].length-1;
		while(startRow<=endRow && startCol<=endCol){
			for(int j=startCol;j<=endCol;j++){
				System.out.print(matrix[startRow][j]+" ");
			}
			for(int i=startRow+1;i<=endRow;i++){
				System.out.print(matrix[i][endCol]+" ");
			}
			for(int j=endCol-1;j>=startCol;j--){
				if(startRow == endRow){
					break;
				}
				System.out.print(matrix[endRow][j]+" ");
			}

			for(int i=endRow-1;i>=startRow+1;i--){
				if(startCol == endCol){
					break;
				}
				System.out.print(matrix[i][startCol]+" ");
			}
			startRow++;
			startCol++;
			endCol--;
			endRow--;
		}
	}

}