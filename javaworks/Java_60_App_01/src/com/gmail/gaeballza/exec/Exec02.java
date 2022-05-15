package com.gmail.gaeballza.exec;

/*
 * 1~100까지 정수의 합 구하기
 * 누적연산
 */
public class Exec02 {

	public static void main(String[] args) {

		int intSum = 0;
		int index;
		for (index = 0; index < 100; index++) {
			intSum += (index + 1);
		}
		System.out.println("1~100까지 정수의 덧셈 결과 : " + intSum);

	}

}
