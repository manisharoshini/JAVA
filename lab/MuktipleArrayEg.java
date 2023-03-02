package examples;

public class MuktipleArrayEg {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}}; //declare
		
		//print
		for(int i=0;i<3;i++) { // outer
			for(int j=0;j<3;j++) { //inner
				System.out.println(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		}

}
