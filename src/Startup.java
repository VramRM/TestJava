import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Startup {

	public static void main(String[] args) {
		//List
		//ArrayList
		//Vector - Synchronous
		//LinkedList
		
		List<String> batsman = new ArrayList<String>();
		batsman.add("Rajiv");
		batsman.add("Harose");
		batsman.add("aj");
		batsman.add("pg");
		batsman.add("1");
		
		System.out.println(batsman.size());
		System.out.println(batsman.contains("Rajiv"));
		
		System.out.println(batsman.containsAll(batsman));
		
		System.out.println(batsman);		
		Iterator<String> arrayListIterator = batsman.iterator();		
		while(arrayListIterator.hasNext()) {
			System.out.println(arrayListIterator.next());
		}
		
		Collections.sort(batsman);
		System.out.println(batsman);
		arrayListIterator = batsman.iterator();
		while(arrayListIterator.hasNext()) {
			System.out.println(arrayListIterator.next());
		}
		
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Rajiv", 10));
		student.add(new Student("ABC", 20));
		student.add(new Student("XYZ", 1));
		student.add(new Student("fALCON", 10));
		student.add(new Student("Eagle", -3));
		
		Collections.sort(student);
		System.out.println(student);
		
		Collections.sort(student, new StudentDescendingSorter());
		Collections.sort(student, new StudentDescendingSorter().reversed());
		System.out.println(student);
		
		student = new LinkedList<Student>();
		
		student.add(new Student("ABC", 10));
		student.add(new Student("DEF", 9));
		student.add(new Student("GHI", 8));
		student.add(new Student("JKL", 11));
		student.add(new Student("MNO", 12));
		student.add(new Student("ABC", 10));
		
		System.out.println(student);
		System.out.println();
		//HashSet
		
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("DEF", 9));
		hashSet.add(new Student("GHI", 8));
		hashSet.add(new Student("JKL", 11));
		hashSet.add(new Student("MNO", 12));
		hashSet.add(new Student("ABC", 10));
		hashSet.add(new Student("ABCD", 10));
		
		System.out.println(hashSet);				
		
		System.out.println();
		System.out.println("************ Tree Set Example ************");
		System.out.println();
		TreeSet<Student> treeSet = new TreeSet<Student>();
		
		treeSet.add(new Student("ABC", 10));
		treeSet.add(new Student("DEF", 9));
		treeSet.add(new Student("GHI", 8));
		treeSet.add(new Student("JKL", 11));
		treeSet.add(new Student("MNO", 12));
		treeSet.add(new Student("ABCD", 10));
			
		System.out.println(treeSet);
		
		System.out.println(treeSet.lower(new Student("", 12)));
		System.out.println(treeSet.lower(new Student("", 8)));

		System.out.println(treeSet.floor(new Student("", 12)));
		System.out.println(treeSet.floor(new Student("", 8)));
		
		
		System.out.println();
		System.out.println("************ Priority Queues Example ************");
		System.out.println();
		
		PriorityQueue<Student> pqStudent = new PriorityQueue<Student>(10, new StudentDescendingSorter());
		
		
		System.out.println(pqStudent.poll());
		pqStudent.offer(new Student("ABC", 6));
		pqStudent.offer(new Student("def", 5));
		pqStudent.offer(new Student("GHI", 4));
		pqStudent.offer(new Student("JKL", 1));
		pqStudent.offer(new Student("MNO", 2));
		pqStudent.offer(new Student("PQR", 3));
		
		
		System.out.println(pqStudent);
		System.out.println(pqStudent.comparator());
		
		System.out.println(pqStudent.peek());
		System.out.println(pqStudent.poll());
		System.out.println(pqStudent.peek());
		System.out.println(pqStudent.poll());
		System.out.println(pqStudent.peek());
		System.out.println(pqStudent.poll());
		System.out.println(pqStudent.poll());
		System.out.println(pqStudent.poll());
		System.out.println(pqStudent.poll());
		System.out.println(pqStudent.poll());
		
		System.out.println();
		System.out.println("************ Hash Map Example ************");
		System.out.println();
		
		HashMap<String, Student> hmStudent = new HashMap<String, Student>();
		hmStudent.put("1", new Student("abc", 2));
		hmStudent.put("2", new Student("DEF", 3));
		hmStudent.put("4", new Student("GHI", 5));
		hmStudent.put("4", new Student("JIKL", 6));
		hmStudent.put("5", new Student("MNOP", 6));
		
		System.out.println(hmStudent.get("4"));
		
		System.out.println(hmStudent);
		
		TreeMap<String, Student> tmStudent = new TreeMap<String, Student>();
		tmStudent.put("1", new Student("abc", 2));
		tmStudent.put("2", new Student("DEF", 3));
		tmStudent.put("5", new Student("GHI", 5));
		tmStudent.put("4", new Student("JIKL", 4));
		tmStudent.put("3", new Student("MNOP", 6));
		
		System.out.println(tmStudent);
		
		System.out.println(tmStudent.ceilingEntry("2"));
		System.out.println(tmStudent.lastKey());
		
	}


}

