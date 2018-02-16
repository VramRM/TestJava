package MyTestJava;

public class SynchronizedMethods {

	int a;
	int b;
	int c;
	
	public SynchronizedMethods() {
		// TODO Auto-generated constructor stub
	}
	
	public int add(int a, int b, int c) {
		try {
			this.a = a;
			Thread.sleep(30);
			this.b = b;
			Thread.sleep(30);
			this.c = c;
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.a + this.b + this.c;
	}

}
