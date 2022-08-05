package com.practice;


class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}

public class RemoveNthNodeFromEndLL {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode h = head;
		ListNode t = head;
		int c = 1;
		while(h!=null){
			h=h.next;
			c++;
		}
		int rem = c-n;
		while(t!=null){
			h=h.next;
			c++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
