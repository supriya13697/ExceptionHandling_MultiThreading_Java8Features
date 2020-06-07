package PreventThreadExecutionMethods;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();
        t2.start();
        
        
        //Pause Current Execution thread to give chance for waiting threads
        //t1.yield();
        
//        try {
//        	//Will wait until t2 completes its execution
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        try {
        	//t1 will wait for 2 sec and starts execution
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Parent Class");
        
	}

}
