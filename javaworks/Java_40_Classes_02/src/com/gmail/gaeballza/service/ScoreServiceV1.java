package com.gmail.gaeballza.service;

import java.util.Scanner;

import com.gmail.gaeballza.utils.Line;

public class ScoreServiceV1 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;

	}

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("우리 고교 성적 처리 V1");
		System.out.println(Line.sLine(lineLength));

		int index = 0;
		while (index < student.length) {

			System.out.print("이름(END:중단) >>");
			String strName = scan.nextLine();
			if (strName.equals("END")) {
				return -1;
			}

			System.out.print("점수(END:중단) >>");
			String strKor = scan.nextLine();
			if (strKor.equals("END")) {
				return -1;
			}
			int intScore = 0;
			try {
				intScore = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intScore;
				index++;
			} catch (Exception e) {
				System.out.println("입력한 값\"" + strKor + "\"는 정수로 변경 불가");
				System.out.println("점수는 정수만 입력 가능");
			}

		}

		return 0;
//		if(index < student.length) {
//			return -1;
//		} else {
//			return 0;
//		}

	}

}
