package MyTestJava;

import java.util.concurrent.Callable;

public class FieldingStats implements Callable<String>{

	public String call() throws Exception {
		for(int i = 1;i<=100; i++) {
			System.out.println("Fielding Stats: " + i);
		}
		return "RESULT";
	}
}
