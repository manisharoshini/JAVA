package examples;

class Owner{
	final int area = 1000;
	String DateOfPurchase = "19-05-2002";
	String Name ="Manisha";
	boolean noc = true ;
	public void renew() { // creating a new function 
		String color = "blue";
		String flat = "2bhk";
		int ceilLength = 8;
		System.out.println("Old Flat Value"+color+" "+flat+" "+ceilLength);
	}
}

class NewOwner extends Owner{
	String dateOfRegister = "3-2-23";
	double flatValue = 230000;
	String Name = "Sheetal";
	public void display(){
		System.out.println("Area is"+area);
		System.out.println("Owner Name"+ super.Name);
		System.out.println("Current Flat Price"+flatValue);
		System.out.println("New Owner Name"+Name);
	}
	public void renew() {
		String color = "Lavender";
		String flat = "3BHK";
		int ceilHeight = 10;
		System.out.println("New Flat Value: "+color+" "+flat+" "+ceilHeight);
		super.renew();
	}
}


public class InheritExample {

	public static void main(String[] args) {
		NewOwner no = new NewOwner();
		no.display();
		no.renew();

	}

}
