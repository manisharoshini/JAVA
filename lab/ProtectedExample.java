package examples;

public class ProtectedExample extends person {
	private String name1="KTH";
	

	public static void main(String[] args) {
		ProtectedExample exa = new ProtectedExample();
		System.out.println("NAme"+exa.name);
		System.out.println("Phone Number: "+exa.numph);
		System.out.println("friend Name:"+exa.name1);
	}
	//getter setter public hai we can use it anywhere even outside the package 

}
