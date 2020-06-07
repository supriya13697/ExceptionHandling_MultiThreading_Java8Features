package TwoWaysCreatingThread;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRunnableThread r = new MyRunnableThread();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Parent Thread");
	}

}
