package com.practice;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class LL {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode s = new ListNode();
	       s.next = head;
	       ListNode fast, slow ;
	       fast = slow = s;
	       for(int i=1;i<=n;++i) {
	    	   fast = fast.next;
	       }
	       while(fast.next!=null) {
	    	   fast = fast.next;
	    	   slow = slow.next;
	       }
	       
	       slow.next = slow.next.next;
	       return s.next;
    }

	public static ListNode deleteDuplicates(ListNode head) {
        ListNode c = head;
        while(c!=null){
            if(c.next !=null && c.val == c.next.val){
                c.next = c.next.next;
            }else {
            	c=c.next;
            }
            
        }
        return head;
    }
	
	  public static void main(String[] args) {
		  ListNode l5 = new ListNode(3, null);
		  ListNode l4 = new ListNode(3, l5);
		  ListNode l3 = new ListNode(2, l4);
		  ListNode l2 = new ListNode(1, l3);
		  ListNode l1 = new ListNode(1, l2);
		  
//		  ListNode res = removeNthFromEnd(l1, 1);
		  ListNode res = deleteDuplicates(l1);
		  while(res!=null) {
			  System.out.println(res.val);
			  res=res.next;
		  }
	  }
	 

}
