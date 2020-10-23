import java.util.Iterator;
import java.util.Scanner;

public class TwoDSrrsyInputOutput {
	
	static Scanner myScanner= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] twoDArray = new int[2][4];
		
		
		
prln("please input...\n");
		
		for(int row=0;row<2;row++) {
			for(int column=0;column<4;column++) {
				
    	prln("twoDArray["+row+"]["+column+"] :");
	
				
				twoDArray[row][column]= myScanner.nextInt();
				
			}
			
		}
		
		prln("\n\nnow output is : \n");
		
		for(int row=0;row<2;row++) {
			for(int column=0;column<4;column++) {
				
				prln(twoDArray[row][column]+"\t");
				
			}
			prln("\n");
			
		}
		
		
		
		

	}
	static void prln(Object anyObject) {
		System.out.print(anyObject);
	}

}
