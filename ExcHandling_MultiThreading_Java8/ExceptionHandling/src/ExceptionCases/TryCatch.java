package ExceptionCases;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int i = 50/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("The rest of the code will be executed");

	}
}
