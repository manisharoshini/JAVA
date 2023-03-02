package examples;
import java.util.Scanner;

public class CalculatorAssignment {
	
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		num1=sc.nextInt();// declare variable
		num2=sc.nextInt();// declare variable
		int res;
		
		System.out.println("Select an Option: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Even/Odd Identifier");
		System.out.println("5. Exit Loop");
		int opt = sc.nextInt();
		do {
			switch (opt) {
			case 1:
				res=num1+num2;
				System.out.println("Addition of Two Numbers is: "+res);
			case 2: 
				res = num1-num2;
				System.out.println("Subtraction: "+res);
			case 3: 
				res = num1*num2;
				System.out.println("Multiply: "+res);
			case 4:
				// Even/Odd Identifier for Num1
				if(num1%2==0) {
					System.out.println("1st number Even Number");
				}
				else {
					System.out.println("1st number Odd Number");
				}
				// Even Odd Identifier for num2
				if(num2%2==0) {
					System.out.println("2nd number Even Number");
				}
				else {
					System.out.println("2nd number Odd Number");
				}
			case 5: 
				break;
			}
		}
		while(opt==0);
		sc.close();

	}

}
