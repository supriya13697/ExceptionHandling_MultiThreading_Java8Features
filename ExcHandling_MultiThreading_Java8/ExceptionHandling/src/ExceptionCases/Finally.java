package ExceptionCases;

public class Finally {

	public static void main(String[] args) {
		try {
				int i = 50 / 0;
			} 
		catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} 
	    finally {
			// TODO: handle finally clause
	    	System.out.println("Finally Block is always executed: to close connection ot to close files....");
		}
		System.out.println("The rest of the code will be executed");
	}

}
