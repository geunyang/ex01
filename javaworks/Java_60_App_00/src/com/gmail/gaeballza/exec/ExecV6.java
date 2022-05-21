package com.gmail.gaeballza.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums[i] = num;
		}
		int count = 0;
		System.out.println("=".repeat(50));
		System.out.println("짝수리스트");
		System.out.println("-".repeat(50));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(nums[i] + ",\t");
				count ++;
				if(count % 5 == 0) {
					System.out.println();
				}
			} 
		}
		System.out.println("=".repeat(50));
	}
}
