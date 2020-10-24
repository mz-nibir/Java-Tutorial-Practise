package FifthLecture;

import java.nio.channels.InterruptedByTimeoutException;

public class Teacher {
	
	String name,gender;
	int phone;
	
	public Teacher() {
		
	}
	
//	void info(String n,String g,int ph) {
//		name=n;
//		gender=g;
//		phone=ph;
//		
//	}
	
	void display() {
		
		System.out.println("name :"+this.name);
		System.out.println("gender :"+this.gender);
		System.out.println("phone :"+this.phone);
		System.out.println("\n\n");
	}

}
