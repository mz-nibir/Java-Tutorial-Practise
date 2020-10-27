package super_Keyword;

public class Car extends Vehicle {
	
	int gear;
	
	public Car(String c,double w,int g) {
		
		super(c, w);
		this.gear=g;
		
	}
	
	void display() {
		super.display();
		System.out.println("Car gear : "+gear);
		
		
	}

}
