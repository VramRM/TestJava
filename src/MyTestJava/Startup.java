package MyTestJava;
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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Startup {

	static ReentrantLock lock = new ReentrantLock();
	static ReentrantLock lock2 = new ReentrantLock();
	
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
		
		System.out.println();
		System.out.println("************ ArrayList/CopyOnWriteArrayList Example ************");
		System.out.println();
		
		//List<Student> student = new ArrayList<Student>();
		List<Student> student = new CopyOnWriteArrayList<Student>();
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
		
		System.out.println();
		System.out.println("************ HashSet Example ************");
		System.out.println();
		
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
		
		
		
		//Synchronized
		//Concurrent Collection
		//Subject Observer Scenario
		
		//Compare and Swap
		
		//ConcurrentlinkQueue 
		
		
		System.out.println();
		System.out.println("************ FailFast Example ************");
		System.out.println();
		
		HashMap<String,String> failFast = new HashMap<String,String>();
		failFast.put("1", "Rajiv");
		failFast.put("2", "Rajiv2");
		failFast.put("3", "Rajiv3");
		failFast.put("4", "Rajiv4");
		
		Iterator<String> failFastIterator = failFast.keySet().iterator();
		try {
			
			while(failFastIterator.hasNext()) {
				System.out.println(failFastIterator.next());
				failFast.put("5", "Rajiv5");
			}
		}catch(Exception e) {
			System.out.println("************ FailFast Exception**************");
			System.out.println(e.toString());
			
		}
		
		System.out.println();
		System.out.println("************ FailSafe Example ************");
		System.out.println();
		
		ConcurrentHashMap<String,String> failSafe = new ConcurrentHashMap<String,String>();
		
		failSafe.put("2", "Rajiv2");
		failSafe.put("3", "Rajiv3");
		failSafe.put("4", "Rajiv4");
		
		Iterator<String> failSafeIterator = failSafe.keySet().iterator();
		
		while(failSafeIterator.hasNext()) {
			System.out.println(failSafeIterator.next());
			failSafe.put("1", "Rajiv");
		}
		
		failSafeIterator = failSafe.keySet().iterator();
		while(failSafeIterator.hasNext()) {
			System.out.println(failSafeIterator.next());			
		}
		
//		testReentrantLock();	
		
		System.out.println();
		System.out.println("************ TestGenerics Example ************");
		System.out.println();
		
		TestGenerics.Test();
		
		
	}

//private static void testReentrantLock() {
//		ReentrantLock	lock	=	this.lock;
//		lock.lock();
//		try{
//			System.out.println();
//			System.out.println("************ ReentrantLock Example ************");
//			System.out.println();
//			
//		}
//		finally {
//			lock.unlock();
//		}
//		
//	}
	
	
		
	
	
	
	

}

