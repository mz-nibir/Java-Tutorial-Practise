import java.util.Scanner;

public class Switchcase {
	
	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please write your name");
		
	String name = myScanner.nextLine();
	
	
	switch (name.length()) {
	case 3: {
		
		System.out.println("short");
		break;
	}
	
case 5: {
		
		System.out.println("perfect");
		break;
	}
	default:
		System.out.println("long");
	}
		


	}

}
