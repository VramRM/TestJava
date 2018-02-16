package MyTestJava;
import java.util.Comparator;

public class StudentDescendingSorter implements Comparator<Student> {

	public StudentDescendingSorter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.marks < o2.marks) {
			return 1;
		}
		if(o1.marks > o2.marks) {
			return -1;
		}
		return 0;
	}

	@Override
	public Comparator<Student> reversed() {
		// TODO Auto-generated method stub
		return Comparator.super.reversed();
	}
	
	

}
