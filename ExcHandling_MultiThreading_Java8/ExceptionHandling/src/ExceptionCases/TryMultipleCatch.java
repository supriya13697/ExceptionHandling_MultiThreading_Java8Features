package ExceptionCases;

public class TryMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int b1 = 10/0;
			int a[] = {2,3,4};
			int b[] = new int[5];
			b[1]=a[10];
			
			
		} 
		catch (ArrayIndexOutOfBoundsException a1) {
			// TODO Auto-generated catch block
			System.out.println(a1);
		}
		catch (ArithmeticException a) {
			// TODO Auto-generated catch block
			System.out.println(a);
		}
		catch (Exception e ) {
			System.out.println(e);
		}
		
        System.out.println("Rest of the code");
		

	}

}
