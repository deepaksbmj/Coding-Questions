package com.practice;

import java.util.ArrayList;
import java.util.List;

public class AllSubstrings {
	public static List<String> subString(String s){
		List<String> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			String str = "";
			for(int j =i;j<s.length();j++) {
				str+=s.charAt(j);
				list.add(str);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {

		List<String> sub = subString("deepak"); 
		sub.stream().forEach(System.out::println);
	}

}
