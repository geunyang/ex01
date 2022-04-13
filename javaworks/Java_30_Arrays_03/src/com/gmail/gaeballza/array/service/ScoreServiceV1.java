package com.gmail.gaeballza.array.service;

import com.gmail.gaeballza.array.utils.Line;

public class ScoreServiceV1 {
	
	private int[] intKor;
	
	public ScoreServiceV1() {
		intKor = new int [100];
	}
	
	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 49) +51;
		}
	}
	
	public void printScore() {
		
		System.out.println(Line.dLine(80));
		System.out.println("국어 성적 일람표");
		System.out.println(Line.sLine(80));
		
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d : %d\t\t", (i + 1), intKor[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println(Line.dLine(80));
	}
	
	public void sumScore() {
		int intSum = 0;
		for (int i = 0; i < intKor.length; i++) {
			intSum += intKor[i];
		}
		System.out.println(Line.sLine(80));
		System.out.println("점수 합계 : " + intSum);
		System.out.println(Line.sLine(80));
	}

}
