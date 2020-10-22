import java.util.Scanner;

public class Bookstore {
	
	static Scanner myscnnScanner= new Scanner(System.in);
	
	
	static String[] book = {"java","C","Python"};
	static final double studentDiscount= 0.3;
	static final double teacherDiscount= 0.4;
	static final double alienDiscount= 0.0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prln("-----WELCOME TO OUR BOOKSTORE------");
		prln("Which Book do you Want?\nAns ");
		String userChoiceString= myscnnScanner.nextLine();
		
		if (book[0].toLowerCase().equals(userChoiceString.toLowerCase())) {
			
			prln("You opted for"+book[0]+" Book.");
			calculatePrice(book[0]);
			
		}
		else if (book[1].toLowerCase().equals(userChoiceString.toLowerCase())) {
			
			prln("You opted for"+book[1]+" Book.");
			calculatePrice(book[1]);
			
		}
		else if (book[2].toLowerCase().equals(userChoiceString.toLowerCase())) {
			
			prln("You opted for"+book[2]+" Book.");
			calculatePrice(book[1]);
			
		}
		else {
			prln("Sorry, We don't have the Book.");
			
		}
		
		
		}
	static void calculatePrice(String bookName) {
		prln("Are you Student, Teacher.Alien?\nAns:");
		String answer= myscnnScanner.nextLine();
		
		double price=200;
		
		if (answer.toLowerCase().equals("teacher")) {
			price= price-(price*teacherDiscount);
			showPrice(price);
			
		}
		else if (answer.toLowerCase().equals("student")) {
			price= price-(price*studentDiscount);
			showPrice(price);
			
		}
		else if (answer.toLowerCase().equals("aline")) {
			price= price-(price*alienDiscount);
			showPrice(price);
			
			
		}else {
			prln("Sorry, We can't serve you");
		}
	}
	
	static void showPrice(double price) {
		prln("your Total payable ammount: "+price);
		prln("\n----THANK YOU FOR SHOPPING FROM OUR BOOKSTORE------");
	}
	
	
	 static void prln(Object anyObject) {
		 System.out.println(anyObject);
	 }
	 
	 static void pr(Object anyObject) {
		 System.out.print(anyObject);
	 }

}
