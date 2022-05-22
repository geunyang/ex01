package com.gmail.gaeballza.exec;

public class ExecApp03A {
	
	public static void main(String[] args) {
		int nums = 0;
		int sum = 0;
		for(int i = 0; i < 10; i ++) {
			nums = (int) (Math.random() * 100) +1;
			sum += even(nums);
			System.out.println(nums);
			
		}
		System.out.println("짝수의 합계 : " + sum);
	}
	
	public static int even(int num) {
		if(num % 2 == 0) {
			return num;
		} else {
			return 0;
		}
	}

}
