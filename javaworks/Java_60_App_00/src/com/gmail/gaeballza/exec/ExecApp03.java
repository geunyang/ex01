package com.gmail.gaeballza.exec;

public class ExecApp03 {
	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 100) + 1;
			result += even(num);
		}
		System.out.println("짝수의 합 : " + result);
	}

	public static int even(int num) {
		if (num % 2 == 0) {
			return num;
		} else {
			return 0;
		}
	}
}
