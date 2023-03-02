package examples;

public class RemoveDuplicate {
	public static int removeDuplicate(int arr1[], int n) {
		if(n==0 || n==1) {
			return n;
		}
		int[] temp =new int[n];
		int j=0;
		for (int i=0;i<n-1;i++) {
			if(arr1[i]!=arr1[i+1]) {
				temp[j++]=arr1[i];
			}
		}
		temp[j++]=arr1[n-1];
		
		//change original array
		for(int i=0;i<j;i++) {
			arr1[i]=temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr1[]= {11,12,13,11,12,13,14,15,16,14,15,16};
		
		int l =arr1.length;
		l=removeDuplicate(arr1,l);
		
		//printing array elements
		for(int i=0;i<1;i++) {
			System.out.println(arr1[i]+" ");
		}
		
	}
}
