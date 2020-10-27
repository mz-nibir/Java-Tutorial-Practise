package super_Keyword;

public class Vehicle {
	
	String colour;
	double weight;
	
	public Vehicle(String c,double w) {
		
		this.colour=c;
		this.weight=w;
		
	}
	
	void display() {
		System.out.println("Car colour : "+colour);
		System.out.println("Car weight :"+weight);
		
	}

}
