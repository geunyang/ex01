package com.gmail.gaeballza.exec;

public class ExecApp07 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 2;
		}
		int count = 0;
		for (int num : nums) {
			int index = 0;
			for (index = 2; index < num; index ++) {
				if(num % 2 == 0) {
					break;
				}
			}
			if(!(index < num)) {
				count++;
			}
		}
		System.out.println("소수의 개수 : " + count);
		

	}
}
