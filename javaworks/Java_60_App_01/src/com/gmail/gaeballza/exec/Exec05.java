package com.gmail.gaeballza.exec;

public class Exec05 {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i ++) {
			int num = (int) (Math.random() * 100) +1;
			nums[i] = num;
			System.out.println(nums[i]);
		}
	}

}
