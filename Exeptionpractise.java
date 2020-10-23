import java.util.Scanner;

public class Exeptionpractise {
	static int res;
	
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x=10;
			int y=sc.nextInt();
		    res= x/y;
		    System.out.println("Result :"+res);
			
		} catch (Exception e) {
			
			System.out.println("exception"+e);
			
		}
		
		
		
		System.out.println("this is last line");
		
		

	}

}
