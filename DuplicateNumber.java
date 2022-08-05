package com.practice;

public class DuplicateNumber {

	 public static int findDuplicate(int[] nums) {
	        int slow = nums[0], fast = nums[0];
	        while(true) {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	            if(slow == fast) break;
	        }
	        slow = nums[0];
	        while(slow != fast) {
	            slow = nums[slow];
	            fast = nums[fast];
	        }
	        return slow;
	    }
	public static void main(String[] args) {
	 int a[] = {1,3,4,2,2};
	 System.out.println(findDuplicate(a));
	}

}
