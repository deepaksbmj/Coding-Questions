package com.practice;

import com.practice.AddTwoLL.ListNode;

public class MiddleOfLL {

	public static ListNode middleNode(ListNode l) {
		if(l == null)
			return null;
		
		ListNode fast = l;
		ListNode slow = l;
		
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public static ListNode middleNode1(ListNode l) {
		if(l == null)
			return null;
		
		ListNode fast = l;
		ListNode slow = l;
		
		while(fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		
		ListNode l6 = new ListNode(6, null);
		ListNode l5 = new ListNode(5, l6);
		ListNode l4 = new ListNode(4, l5);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(2, l3);
		ListNode l = new ListNode(1, l2);
		
		System.out.println(middleNode(l).val);
	}

}
