package com.practice;

public class AddTwoLL {


	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {
			this.val = val; 
		}
		ListNode(int val, ListNode next) { 
			this.val = val; this.next = next; 
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode ans = new ListNode(0);
		ListNode current = ans;

		while(l1 != null || l2 != null || carry == 1){
			int sum = 0;

			if(l1 != null){
				sum += l1.val;
				l1 = l1.next;
			}

			if(l2 != null){
				sum += l2.val;
				l2 = l2.next;
			}
		
			sum += carry;
			carry = sum/10;
			ListNode node = new ListNode(sum%10);

			current.next = node;
			current = current.next;
		}
		return ans.next;
	}
	
	public static void main(String[] args) {
		
		ListNode l1a = new ListNode(3, null);
		ListNode l1b = new ListNode(4, l1a);
		ListNode l1c = new ListNode(2, l1b);
		
		ListNode l2d = new ListNode(9, null);
		ListNode l2a = new ListNode(7, l2d);
		ListNode l2b = new ListNode(6, l2a);
		ListNode l2c = new ListNode(5, l2b);
		
		ListNode r = addTwoNumbers(l1c, l2c);
		while(r!=null) {
			System.out.println(r.val);
			r=r.next;
		}

	}

}
