package FifthLecture;



public class LearningClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher teacher1 = new Teacher();
		
//		teacher1.name= "nibir";
//		teacher1.gender= "male";
//		teacher1.phone=1722;
		teacher1.info("nibir", "male", 1722);
		
		teacher1.display();
		

		
	Teacher teacher2 = new Teacher();
//		teacher2.name= "nihan";
//		teacher2.gender= "male";
//		teacher2.phone=173333;
		
		teacher2.info("nihan", "male", 173333);
		
		teacher2.display();
		

	}

}
