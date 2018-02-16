import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Startup {

	public static void main(String[] args) {
		//List
		//ArrayList
		//
		
		
		List<String> batsman = new ArrayList<String>();
		batsman.add("Rajiv");
		batsman.add("Harose");
		batsman.add("aj");
		batsman.add("pg");
		batsman.add("1");
		
		System.out.println(batsman.size());
		System.out.println(batsman.contains("Rajiv"));
		
		System.out.println(batsman.containsAll(batsman));
		
		Iterator<String> arrayListIterator = batsman.iterator();
		
		while(arrayListIterator.hasNext()) {
			System.out.println(arrayListIterator.next());
		}
		
		Collections.sort(batsman);
		
		arrayListIterator = batsman.iterator();
		while(arrayListIterator.hasNext()) {
			System.out.println(arrayListIterator.next());
		}
		
		
		
	}
}

