package examples;
// print array in sorted form(asc/desc)
public class SortedArray {

	public static void main(String[] args) {
		int [] arr=new int[] {19,87,56,33,45,23,55,43,21,78,90,100};
		int temp= 0; // temproary variable 
		//Descending order
		for(int m=0;m<arr.length;m++) {
			for(int n=m+1;n<arr.length;n++) {
				if(arr[m]<arr[n]) {
					temp=arr[m];
					arr[m]=arr[n];
					arr[n]=temp;
				}
			}
		}
		System.out.println("Elements in Descending order: ");
		for(int m=0;m<arr.length;m++) {
			System.out.println(arr[m]+" ");
		}
		
		// Ascending order
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements in Ascending order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
