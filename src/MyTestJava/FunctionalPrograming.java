package MyTestJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalPrograming {

	public static void Test() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		numbers.stream()
		.filter(number -> number % 2 != 0).forEach(number -> System.out.println(number));
		
		System.out.println();
		System.out.println(numbers.stream()
		.filter(number -> number % 2 != 0).count());
		
		System.out.println();
		List<String> names = Arrays.asList("Rajiv1","Rajiv1" ,"Rajiv2","Rajiv2","Raji4");
		names.stream()
		.filter(name -> name.length()>=6)
		.forEach(name -> System.out.println(name));
		
		System.out.println();
		names.stream()
		.distinct()
		.forEach(name -> System.out.println(name));
		
		System.out.println();
		names.stream()
		.sorted()
		.forEach(name -> System.out.println(name));
		
		System.out.println();
		names.stream()
		.map(name -> name + name)
		.forEach(name -> System.out.println(name));
		
		System.out.println();
		 
		System.out.println(names.stream()
		.map(name -> name + name)
		.collect(Collectors.toList()));
		System.out.println();
		
		System.out.println(names.stream()
				.filter(name -> name.contains("Rajiv"))
				.collect(Collectors.toList()));
		
		System.out.println(names.stream()
				.filter(name -> name.contains("Rajiv"))
				.reduce("", String::concat));
		
	}
	
	
}
