package TwoWaysCreatingThread;

public class MyThread extends Thread{
	
//	public void start() {
//		System.out.println("No thread will be created");
//	}
	
	public void run() {
		System.out.println("Child Class");
		System.out.println("Child name " +Thread.currentThread().getName());
	}
}
