package Sign_Login;
import java.util.Scanner;

public class Input {

	Scanner sc = new Scanner(System.in);
	
	String getString() {
		
		String string;
		
		string = sc.nextLine();
		
		return string;
	}
	
	int getInteger() {
		
		int x;
		
		x = sc.nextInt();
		
		return x;
	}
}
