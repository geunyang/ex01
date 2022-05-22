package com.gmail.gaeballza.exec.service;

public class ScoreServiceV5A {
	private int[] intKor;
	
	public ScoreServiceV5A(int length) {
		intKor = new int[length];
	}
	
	public void makeScore() {
		for(int i = 0; i < intKor.length; i ++) {
			int nums = (int) (Math.random() * 100) +1;
			intKor[i] = nums;
		}
	}
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("국어 성적 일람표");
		System.out.println("-".repeat(80));
		for(int i = 0; i < intKor.length; i ++) {
			System.out.printf("%d : %d\t\t",i+1,intKor[i]);
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("=".repeat(80));
	}
	public void sumScore() {
		int sum = 0;
		
		System.out.println("=".repeat(80));
		for(int i = 0; i < intKor.length; i ++) {
			sum += intKor[i];
		}
		System.out.println("총점 : "+ sum);
		System.out.println("=".repeat(80));
		
	}
}
