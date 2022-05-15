package com.gmail.gaeballza.exec;

public class Exec06 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int intSum = 0;
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int) (Math.random() *100) + 1;
		} 
		for(int num : nums) {
			System.out.println(num);
			intSum += num;
		}
		System.out.println("합계 : " + intSum);
	}

}
