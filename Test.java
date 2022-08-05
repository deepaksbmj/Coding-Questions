package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String args[]) {
		
//		int a[] = {1,2,3,4,5};
//		List<Integer> z = Arrays.asList(10,9,8,7,6);
//		List<Integer> x= Arrays.stream(a).boxed().toList();
//		
//		x.stream().forEach(System.out::println);
//		
//		int c[] = z.stream().mapToInt(Integer::intValue).toArray();
	
		List<String> names = Arrays.asList("william", "jones", "aaron", "seppe", "frank", "gilliamturner");
		System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliamturner"));
	}

	private static int getTotalNumberOfLettersOfNamesLongerThanFive(String... str) {
		
		List<String> s = Arrays.asList(str);
		List<String> names = Arrays.asList(str).stream()
				.filter(t -> t.length()>5)
				.collect(Collectors.toList());
		int c = 0;
		for(String name:names) {
			c+=name.length();
		}
		return c;
	}
	
	

}
