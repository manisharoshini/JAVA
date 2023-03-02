package examples;
// Multiply Two Matrices
public class MultiplyMatrices {

	public static void main(String[] args) {
		// initialize two matrices
		int a[][] ={{1,2},{4,5}};
		int b[][]= {{3,2},{6,5}};
		
		//Store result
		int c[][]= new int [3][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=0; //since humlog ne koi ccalic nji kiya
				for (int k=0;k<2;k++) {
					c[i][j]+= a[i][k]* b[k][j];
				}
				System.out.println(c[i][j]+ " ");
				
			}
			System.out.println();
		}
		
	}

}
