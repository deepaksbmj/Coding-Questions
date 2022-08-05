package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

	 public static String solve(String str) {
		        String c[]=str.split("\\s+");
		        Collections.reverse(Arrays.asList(c));
		        return Arrays.asList(c).stream().collect(Collectors.joining(" "));
	    }
	 
	public static void main(String[] args) {
		System.out.println(solve("  Welcome to   Coding  Ninjas"));

	}

}
