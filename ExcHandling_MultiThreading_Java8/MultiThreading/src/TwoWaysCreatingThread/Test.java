package TwoWaysCreatingThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("My thread name is " +Thread.currentThread().getName());
		System.out.println("My thread priority is " +Thread.currentThread().getPriority());
		
		MyThread t = new MyThread();
		
		t.setPriority(10);
		t.start();
		//t.run();   //No thread will be created
		t.setName("Sathvik");
		//System.out.println("Child class name " +t.getName());
		
		
		
		System.out.println("Main Thread");
		System.out.println("My thread name is " +Thread.currentThread().getName());
		
//		Thread.currentThread().setName("Supriya");
//		System.out.println("My thread name is " +Thread.currentThread().getName());
//		
//		
//		Thread.currentThread().setPriority(9);
//		System.out.println("My thread priority is " +Thread.currentThread().getPriority());

	}

}
