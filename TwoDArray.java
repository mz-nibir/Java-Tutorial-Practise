
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] twoDArray= new int[2][4];
		
		twoDArray[0][0]=1;
		twoDArray[0][1]=3;
		twoDArray[0][2]=4;
		twoDArray[0][3]=5;
		
		twoDArray[1][0]=2;
		twoDArray[1][1]=4;
		twoDArray[1][2]=5;
		twoDArray[1][3]=9;
		
		twoDArray[1][2]+=twoDArray[0][2]+twoDArray[0][3];
		
		System.out.println("array is "+ twoDArray[1][2]);

	}

}
