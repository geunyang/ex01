package com.gmail.gaeballza.exec;

public class ExecApp02 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int) (Math.random() * 100) +1;
		}
		int sum = 0;
		for(int i = 0; i < nums.length; i ++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
}
