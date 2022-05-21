package com.gmail.gaeballza.exec.service;

public class ScoreServiceV5 {

	private int[] intKor;

	public ScoreServiceV5(int length) {
		intKor = new int[length];
	}

	public void makeScore() {

		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}

	}

	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("성적일람표");
		System.out.println("-".repeat(50));
		
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d : %d\t\t", (i + 1), intKor[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("=".repeat(50));
	}

	public void sumScore() {
		int sum = 0;
		System.out.println("=".repeat(50));
		for (int i = 0; i < intKor.length; i++) {
			sum += intKor[i];
		}
		System.out.println("국어 점수 합계 : " + sum);
		System.out.println("=".repeat(50));
		

	}

}
