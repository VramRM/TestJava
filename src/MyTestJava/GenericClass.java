package MyTestJava;

import java.util.ArrayList;

//public class GenericClass<T extends String> {
//public class GenericClass<T extends Integer> {
public class GenericClass<T extends Object> {
	private ArrayList<T> myList; 
	public GenericClass(ArrayList<T> myList) {
		// TODO Auto-generated constructor stub
		this.myList = myList;
	}
	@Override
	
	public String toString() {
		return "GenericClass [myList=" + myList + "]";
	}
	
	public void Add(T value) {
		this.myList.add(value);
	}
	
	public T Remove(int index) {
		return this.myList.remove(index);
	}

	
}
