package ExceptionCases;


//e.printStackTrace()  -- Name of Exception,Description and stack trace
//e.getString()  -- Name of Exception,Description
//e.getmessage() -- Description

public class MethodsToPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int i = 10/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e); //Internally uses e.toString()
			//System.out.println(e.getMessage());
			
		}
		
	}

}
