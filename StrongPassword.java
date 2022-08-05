package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
	
	public static boolean strongPasswordCheckerII(String password) {
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*()., ?]).+$";

//		!@#$%^&*()-+
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		if(password == null || password.length() == 0)
        	return false;
		else if(password.length()<8)
			return false;
		else if(m.matches()) {
			for(int i =1;i<password.length();i++) {
				if(password.charAt(i)==password.charAt(i-1)) {
					return false;
				}
			}
			return true;
		}
		return false;
    }
	
	public static void main(String ...args) {
		System.out.println(strongPasswordCheckerII("(Aa1a1a1"));
	}
}
