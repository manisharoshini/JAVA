package examples;

public class ArrayExample {
// SINGLE ARRAY
	// MEthod mai banaya 
	static void showArray() {
		int arr1[]= {1,2,3,4,5};
		for(int a:arr1) {
			System.out.println(" "+a);
		}
	}
	public static void main(String[] args) {
		int myarray[]=new int[4]; // declare and initialization
		
		
		myarray[0]=78; // initialization
		myarray[1]=55; // initialization
		myarray[2]=34; // initialization
		myarray[3]=78; // initialization
		
		// traversing on array
		for(int i=0;i<myarray.length;i++) {
			System.out.println("Array:"+myarray[i]);
		}
		
		float num[]= {3.3f,5.5f,8.3f,9.8f}; // declare instantiation and initialization
		
		//print num array
		System.out.println("Array Elements: ");
		for(int j=0;j<num.length;j++) {
			System.out.println(num[j]+",");
		}
		// for (float j:num){
		// Sysout(j+","); Advance For method (for each loop)
		
	}

}
