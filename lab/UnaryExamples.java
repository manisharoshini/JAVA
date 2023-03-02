package examples;

public class UnaryExamples {
	public void calcIncreement() {
		int x=10;
		System.out.println("X++ "+ x++); // pehle assign hoga respected variable and update hoga 
		System.out.println("X++ "+ x++);
		System.out.println("++X "+ ++x); // pehle update and then stored in respective variable 
		System.out.println("X++ "+ x++);
		System.out.println("VAlue of X: "+x);
	}
	public void calcDecreemnet() {
		int x=10;
		System.out.println("x-- "+ x--);
		System.out.println("x-- "+ x--);
		System.out.println("--x "+ --x);
		System.out.println("--x "+ --x);
		System.out.println("x-- "+ x--);
		System.out.println("x= "+x);
	}
	public static void main(String[] args) {
		UnaryExamples ue = new UnaryExamples();
		ue.calcDecreemnet();
		ue.calcIncreement();

	}

}
