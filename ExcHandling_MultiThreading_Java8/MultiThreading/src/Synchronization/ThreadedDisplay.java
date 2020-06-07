package Synchronization;

public class ThreadedDisplay extends Thread{
	
	public String name;
	Display display;
	
	public ThreadedDisplay(String name, Display display) {
		this.name = name;
		this.display = display;
	}
	
	public void run() {
		
		//synchronized block
		//synchronized(display) {
			display.message(name);
		//}
	}
	
	

}
