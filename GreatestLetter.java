package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreatestLetter {
	public static String greatestLetter(String s) {
		Map<String, Integer> m = new HashMap<>();
		if(s==null || s.length()==0)
			return "";
		for(int i=0;i<s.length();i++) {
			String str = (s.charAt(i)+"");
			if(m.containsKey(str)) {
				int c = m.get(str);
				m.put(str, ++c);
			}else {

				m.put(str, 1);
			}
		}
		
		List<String> l = new ArrayList<>();

		m.forEach((k,v)->{
			if(v>=2) {
				l.add(k);
			}
			System.out.println(k+"-"+v);
		});
		
		if(l.size() == 0)
			return "";
		Collections.sort(l);
		return l.get(l.size()-1);
	}


	public static void main(String[] args) {
		System.out.println(greatestLetter("AbCdEfGhIjK"));

	}

}
