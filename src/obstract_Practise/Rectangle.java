package obstract_Practise;

public class Rectangle extends Shape {
	
	//dim1,dim2;
	
	
	public Rectangle (double dim1, double dim2) {
		
		super(dim1, dim2);
	}
	
	void area() {
		
		double result= dim1*dim2;
		
		System.out.println("Rectangle Area is :"+result);
		
	}

}
