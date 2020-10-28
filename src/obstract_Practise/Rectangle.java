package obstract_Practise;

public class Rectangle extends Shape {
	
	double length,width;
	
	public Rectangle(double length,double width) {
		
		this.length=length;
		this.width=width;
		
	}
	
	double area() {
		
		return length*width;
		
		//System.out.println("Rectangle Area is :"+length*width);
		
	}

}
