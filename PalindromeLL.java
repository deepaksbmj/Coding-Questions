package com.practice;

import java.util.Stack;

public class PalindromeLL {

	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	  public static boolean isPalindrome(ListNode head) {
	        Stack<Integer> s = new Stack<Integer>();
	        ListNode h= head;
	        while(h!=null) {
	        	s.add(h.val);
	        	h = h.next;
	        }
	        
	        while(!s.isEmpty() && head != null) {
	        	if(s.pop() != head.val) {
	        		return false;
	        	}
	        	head = head.next;
	        }
	        return true;
	        
	    }
	  
	  public static boolean isPalindrome1(ListNode head) {
		  MiddleOfLL mid = new MiddleOfLL();
//		  ListNode m = mid.middleNode(head);
	        Stack<Integer> s = new Stack<Integer>();
	        ListNode h= head;
	        while(h!=null) {
	        	s.add(h.val);
	        	h = h.next;
	        }
	        
	        while(!s.isEmpty() && head != null) {
	        	if(s.pop() != head.val) {
	        		return false;
	        	}
	        	head = head.next;
	        }
	        return true;
	        
	    }
	  
	  public static int[] plusOne(int[] digits) {
		  int n = digits.length;
	        for (int e=n-1; e>=0; e--){
	            if(digits[e]!=9){
	                digits[e]++;
	                break;
	            }else{
	                digits[e] = 0;
	            }
	        }
	    
	    if (digits[0]==0){
	        digits = new int[n+1];
	        digits[0] = 1;
	    }
	    
	    return digits;
	    }
	  
	  public static void main(String[] args) { 
		  int a[] = {5,9};
		  int b[] =  plusOne(a);
		  for(int i:b) {
			  System.out.print(i);
		  }
	  }
	 

}
