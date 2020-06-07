package ExceptionCases;

public class ThrowKeyword {
	static void validate(int age) {
		if(age<18)  {
		      throw new ArithmeticException("not valid");  
		}
		else  {
		      System.out.println("welcome to vote");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(17);
		System.out.println("Execute Rest of the code");
	}
}

