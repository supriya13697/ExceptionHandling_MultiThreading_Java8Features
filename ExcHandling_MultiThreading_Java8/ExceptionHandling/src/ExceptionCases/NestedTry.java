package ExceptionCases;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("statement1");
			
			try {
				int b1 = 10/0;
			} catch (ArithmeticException a) {
				// TODO Auto-generated catch block
				System.out.println(a);
			}
			
			System.out.println("Statement2");
			
			try {
				int a[] = {2,3,4};
				int b[] = new int[5];
				b[1]=a[10];
			} catch (ArrayIndexOutOfBoundsException a1) {
				// TODO Auto-generated catch block
				System.out.println(a1);
			}
			
			System.out.println("Rest of the code");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
