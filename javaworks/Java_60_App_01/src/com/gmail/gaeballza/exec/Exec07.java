package com.gmail.gaeballza.exec;

public class Exec07 {
	public static void main(String[] args) {
		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intSum += num;
			System.out.println(num);
		}
		System.out.println("짝수의 합 : " + intSum);
	}

	public static int even(int num) {
		if (num % 2 == 0) {
			return num;
		} else {
			return 0;
		}
	}
}
