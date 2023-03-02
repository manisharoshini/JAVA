package examples;

public class StringMethodEg {

	public static void main(String[] args) {
		String a="manisha";
		System.out.println(a.toUpperCase());// convert Anudip to uppercase(capital)
		System.out.println(a.toLowerCase());// lowercase
		System.out.println(a.startsWith("Anu"));// This will return True if its true
		System.out.println(a.endsWith("sha"));// This will return boolean value
		System.out.println(a.charAt(6));// 6th position ka letter batata hai 
		System.out.println(a.length());// returna the length also include space
		System.out.println(a.replace("manisha","Manisha"));// original string same rehega sirf vo line ke replace hoga since String is IMMUTABLE
		
		
		
		
		int num =55;
		String b = String.valueOf(num);// convert it number value into String
		System.out.println(b+55);
	}

}
