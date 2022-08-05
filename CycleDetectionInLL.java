package com.practice;

import java.util.HashMap;

public class CycleDetectionInLL {

	public static boolean hasCycle(ListNode head) {
		if(head == null)
			return false;
		HashMap<ListNode,Integer> map =new HashMap<ListNode,Integer>();
		while(head != null){
			if(map.containsKey(head)){
				return true;
			}else{
				map.put(head, head.val);
			}
			head=head.next;
		}
		return false;
	}
	
	public static boolean hasCycle1(ListNode head) {
		if(head == null)
			return false;

		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;

			if(slow == fast ) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode l4 = new ListNode(-4);
		ListNode l3 = new ListNode(0,l4);
		ListNode l2 = new ListNode(2,l3);
		ListNode l1 = new ListNode(3,l2);
		l4.next = l2;
		
		System.out.println(hasCycle1(l1));
	}

}
