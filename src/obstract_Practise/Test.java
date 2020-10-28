package obstract_Practise;

public class Test {

	public static void main(String[] args) {
		
		Shape s;
		
		s= new Rectangle(10, 20);
		System.out.println("Rectangle Area is :"+s.area());
		
		s=new Circle(10);
		System.out.println("Circle Area is :"+s.area());
		
		s= new Triangle(10, 20);
		System.out.println("Triangle Area is :"+s.area());
		

	}

}
