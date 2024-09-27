package newApplication;

public class Thread2 implements Runnable {
	
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println("Thread 2 is running " + i);
		}
	}

}
