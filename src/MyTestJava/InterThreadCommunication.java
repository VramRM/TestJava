package MyTestJava;

public class InterThreadCommunication extends Thread{
	
	int sum;
	
	public void run() {
		synchronized(this) {
			for(int i=1; i<=300; i++) {
				sum += i;
			}
			notify();
		}
	}
	
	public InterThreadCommunication() {
		// TODO Auto-generated constructor stub
	}

}
