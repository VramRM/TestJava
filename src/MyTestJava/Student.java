package MyTestJava;

public class Student implements Comparable<Student> {
	String name;
	int marks;
	public Student(String name, int marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		if(this.marks > that.marks) {
			return 1;
		}
		if(this.marks < that.marks) {
			return -1;
		}
		return 0;
	}

	
}
