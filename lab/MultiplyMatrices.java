package examples;
// Multiply Two Matrices
public class MultiplyMatrices {

	public static void main(String[] args) {
		// initialize two matrices
		int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{3,2,1},{6,5,4},{9,8,7}};
		
		//Store result
		int c[][]= new int [3][3];
		
		// adding matrices
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j]; // Adding matrices
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
