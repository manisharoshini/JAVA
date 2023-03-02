package examples;
import java.util.StringTokenizer;
public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer s= new StringTokenizer("Welcome to java class At Anudip","");
		
		while(s.hasMoreElements()) {
			System.out.println(s.nextToken());
		}

	}

}
