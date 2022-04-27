package com.gmail.gaeballza.app.exec;

public class Exec3 {

	public static void main(String[] args) {

		int intNums = 0;
		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			intNums = (int) (Math.random() * 100) + 1;
			intSum += even(intNums);
			System.out.println(intNums);
		}
		System.out.println("짝수의 합계 : " + intSum);
	}

	public static int even(int num) {
		if (num % 2 == 0) {
			return num;
		} else {
			return 0;
		}
	}

}
