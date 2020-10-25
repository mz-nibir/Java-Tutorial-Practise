package static_variable;

public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValue r1=new CallByValue();

		r1.name= "Nibir";
		
		System.out.println("before call :"+r1.name);
		
		r1.change(r1);
		
		System.out.println("X After call :"+r1.name);
		

	}

}
