package obstract_Practise;

public class Circle extends Shape{
	
	double redius;
	final double pi=3.1416;
	
	public Circle(double redius) {
		this.redius=redius;
		
	}
	
	double area() {
		
		return pi*(redius*redius) ;
	}

}
