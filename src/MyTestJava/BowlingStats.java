package MyTestJava;

public class BowlingStats implements Runnable{

	
	public void run() {
		for(int i = 0; i<=60; i++) {
			System.out.println("Processing BowlngStats Record:" + Thread.currentThread() + i );
		}
	}

}
