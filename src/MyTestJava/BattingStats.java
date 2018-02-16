/**
 * 
 */
package MyTestJava;

/**
 * @author Rajiv.Mehta
 *
 */
public class BattingStats extends Thread{

	/**
	 * 
	 */
	public BattingStats() {
		// TODO Auto-generated constructor stub
		
	}

	public void run() {
		for(int i = 0; i<=60;i++) {
			System.out.println("Processing BatingStats Record:" + i );
		}
	}
}
