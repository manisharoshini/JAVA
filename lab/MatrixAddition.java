package examples;
// MAM ka code 3x3 matrix
public class MatrixAddition {

	public static void main(String[] args) {
		int num1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int num2[][]= {{3,2,1},{6,5,4},{9,8,7}};
		
		// restultant matrix
		int res[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				res[i][j]=num1[i][j]+num2[i][j];
				System.out.println(res[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
