package MyTestJava;

import java.util.ArrayList;

public class TestGenerics {

	
	
	public static void Test() {
		GenericClass<String> stringGenericClass = new GenericClass<String>(new ArrayList<String>());
		GenericClass<Integer> intGenericClass = new GenericClass<Integer>(new ArrayList<Integer>());
		
		stringGenericClass.Add("Yahoo");
		stringGenericClass.Add("gmail");
		stringGenericClass.Add("rediff");
		
		System.out.println(stringGenericClass);
		System.out.println(stringGenericClass.Remove(1));
		
		
		
		intGenericClass.Add(2);
		intGenericClass.Add(3);
		intGenericClass.Add(4);
		
		System.out.println(intGenericClass);
		System.out.println(intGenericClass.Remove(1));
	}

}
