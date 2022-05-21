package com.gmail.gaeballza.exec;

public class ExecV5 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += (i + 1);
		}
		System.out.println("1~100까지 정수의 합 : " + sum);
	}
}
