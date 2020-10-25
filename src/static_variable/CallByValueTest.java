package static_variable;

public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValue ob=new CallByValue();
		int x=10;
		
		System.out.println("X before call :"+x);
		
		ob.change(x);
		
		System.out.println("X After call :"+x);
		

	}

}
