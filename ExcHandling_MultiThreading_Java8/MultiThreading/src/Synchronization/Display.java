package Synchronization;

public class Display {

	public synchronized void message(String name) {
		
		for(int i=0; i<5;i++) {
			
			System.out.println("The name is" +name);

			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupted Exception");
			}
			
			System.out.println("Done");
		}
	}
}
