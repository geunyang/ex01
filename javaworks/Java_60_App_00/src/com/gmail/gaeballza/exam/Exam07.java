package com.gmail.gaeballza.exam;

public class Exam07 {
	public static void main(String[] args) {
		int dan = 7;
		int index = 0;
		System.out.println("=".repeat(50));
		System.out.println("7단 구구단");
		System.out.println("-".repeat(50));
		for(index = 1; index < 10; index ++) {
			System.out.printf("%d × %d = %d\n", dan, index, dan*index);
		}
		System.out.println("=".repeat(50));		
	}
}
