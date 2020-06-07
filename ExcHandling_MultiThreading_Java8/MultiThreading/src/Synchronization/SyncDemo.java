package Synchronization;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d = new Display();
		ThreadedDisplay t1 = new ThreadedDisplay("supriya",d);
		ThreadedDisplay t2 = new ThreadedDisplay("reddy",d);
		
		t1.start();
		t2.start();
		
	}

}
