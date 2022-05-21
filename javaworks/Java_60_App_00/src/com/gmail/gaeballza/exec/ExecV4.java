package com.gmail.gaeballza.exec;

public class ExecV4 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for(int i = 0; i < nums.length; i ++) {
			int num = (int) (Math.random() * 100) +1;
			nums[i] = num;
		}
		int sum = 0;
		for(int i = 0; i < nums.length; i ++) {
			if(nums[i] % 2 == 0) {
				sum += nums [i];
			}
		}
		System.out.println("짝수의 합 : " +sum);
	}
}
