import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Q1 {
	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		int coverage=0;
		for(int i=0;i<mat.size();i++){
			for(int j=0;j<mat.get(0).size();j++){
				if(mat.get(i).get(j) == 0){
					if((j+1<mat.get(0).size()) && (mat.get(i).get(j+1) == 1)){
						// System.out.println("right");
						coverage++;
					}
					if((j-1 >=0) && (mat.get(i).get(j-1) == 1) ){
						// System.out.println("left");
						coverage++;
					}
					if((i-1 >=0) && (mat.get(i-1).get(j) == 1)){
						// System.out.print("up");
						coverage++;
					}
					if((i+1< mat.size()) && (mat.get(i+1).get(j) == 1)){
						// System.out.print("down");
						coverage++;
					}

				}
			}
		}

		return coverage;
	}

}