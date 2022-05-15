package com.gmail.gaeballza.exec;

public class Exec08 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		for(int num : nums) {
			if(num >= 55) {
				System.out.println(num);
			}
		}
	}

}
