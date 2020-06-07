package ExceptionCases;

public class TestExceptionPropagation1 {
	void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }
	   catch(Exception e){
		   System.out.println("exception handled");
	   }  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestExceptionPropagation1 t = new TestExceptionPropagation1();
	t.p();
	System.out.println("Rest of the code");
	}
}
