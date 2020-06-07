package NewFeatures;

//No need to create new class to implement interfaces
//Lambdas can only be used with functional interface
//You can only have one method inside a functional interface. if you have more it would not be functional interface 
interface A{
	void show();
}

//We are using this class only once and just only to implement A interface
//class Demo implements A{
//	public void show() {
//		System.out.println("Hello");
//	}
//}

public class LambdaDemo {

	public static void main(String[] args) {
//		A obj;
//        obj = new Demo();
//        obj.show();
		
//-------------------------------------------------------------------------------------------------------		
		
		//Instead of creating class we can directly implement here
//		A obj;
//		obj = new A() {  //anonymous Inner Class
//			public void show() {
//				System.out.println("Hello");
//				}
//			};
//		obj.show();
		
//-------------------------------------------------------------------------------------------------------
		//To avoid the above boiler plate code we will go with lambda expressions
//	    A obj;
//	    obj = () ->
//	    		{
//	    			System.out.println("Hello");
//	    		};
//	    obj.show();
		
//-------------------------------------------------------------------------------------------------------
	    A obj;
	    obj = () -> System.out.println("Hello");
	    obj.show();
		
	}	

 }
