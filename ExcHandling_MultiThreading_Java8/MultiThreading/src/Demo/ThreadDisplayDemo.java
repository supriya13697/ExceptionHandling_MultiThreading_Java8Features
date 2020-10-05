package Demo;

import java.util.Date;

public class ThreadDisplayDemo extends Thread{

	public ThreadDisplayDemo() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		
		 try {
		        while (true) {
		            System.out.println(new Date());
		            Thread.sleep(60000);
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
	}
}
