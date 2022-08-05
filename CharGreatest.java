package com.practice;

public class CharGreatest {

	public static char nextGreatestLetter(char[] letters, char target) {
		int s = 0, e = letters.length-1;
		while(s<=e){
			int m = s+(e-s)/2;
			if (target>=letters[m]) {
				s = m+1;
			}else if (target < letters[m]){
				e = m-1;
			}
		}
		return letters[s % letters.length];
	}

	public static void main(String[] args) {
		char c[] = {'c','f','j'};
		System.out.println(nextGreatestLetter(c, 'd'));
	}

}
