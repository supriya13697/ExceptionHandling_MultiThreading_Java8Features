package ExceptionCases;

class MyUserException extends Exception {
	String a = "supriya";
	
	MyUserException(String b){
		a = b;
	}

	@Override
	public String toString() {
		return "MyUserException [a=" + a + "]";
	}
}

public class UserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	throw new MyUserException("This is user defined exception");
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        
	}

}
