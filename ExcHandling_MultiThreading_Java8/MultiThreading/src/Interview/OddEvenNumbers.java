package Interview;

public class OddEvenNumbers {

	boolean odd = false;
	int count = 0;
	int max = 20;

	public void oddNumbers() {

		synchronized(this) {
			while(count < max) {

				while (!odd) {
					try {
						wait(); //odd thread waiting
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(count);
				count++;
				odd = false;
				notify();
			}
		}
	}

	public void evenNumbers() {

		synchronized(this) {
			while(count < max) {

				while (odd) {
					try {
						wait(); //even thread waiting
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(count);
				count++;
				odd = true;
				notify();
			}
		}
	}

	public static void main(String args[]) {

		OddEvenNumbers oe = new OddEvenNumbers();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				oe.evenNumbers();			
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				oe.oddNumbers();
			}

		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}