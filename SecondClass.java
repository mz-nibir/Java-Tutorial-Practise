import java.util.Scanner;

public class SecondClass {
	
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Please enter a number");
		
		int firstShortNumber= sc.nextInt();
		
//		int firstShortNumber=0;
//		 int secondIntNumbe;
		
	    int statement= prokria(firstShortNumber);
		 
		
		 System.out.println(statement);

	}
	
	static public int prokria(int firstValue) {
		
		int answer= firstValue*100;
		return answer;
		
	}

}
