package com.practice;

public class IntersectionOfTwoLL {
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode d1 = headA, d2=headB;
		int c1=0,c2=0;
		if(headA == null || headB == null) {
			return null;
		}
		while(d1 !=null) {
			c1++;
			d1=d1.next;
		}
		
		while(d2 !=null) {
			c2++;
			d2=d2.next;
		}
		
		ListNode extra = c2>c1 ? headB : headA;
		int diff = Math.abs(c2-c1);
		ListNode second = (extra == headB ) ? headA :headB;
		while(diff>0) {
			extra = extra.next;
			diff--;
		}
		
		while(second != null && extra != null) {
			if(second == extra) {
				return second;
			}
			second = second.next;
			extra =extra.next;
		}
		return null;
	}

	public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) {
			return null;
		}
		
		ListNode d1 = headA, d2=headB;
		
		while(d1 != d2) {
			d1 = (d1 == null) ? headB : d1.next;
			d2 = (d2 == null) ? headA : d2.next;
		}
		
		return d1;
	}
	public static void main(String[] args) {
		ListNode l15 = new ListNode(5,null);
		ListNode l14 = new ListNode(4,l15);
		ListNode l13 = new ListNode(8,l14);
		
		//L1
		ListNode l12 = new ListNode(1,l13);
		ListNode l11 = new ListNode(4,l12);

		//L2
		ListNode l23 = new ListNode(1,l13);
		ListNode l22 = new ListNode(6,l23);
		ListNode l21 = new ListNode(5,l22);

		System.out.println(getIntersectionNode(l11,l21).val);
	}

}
