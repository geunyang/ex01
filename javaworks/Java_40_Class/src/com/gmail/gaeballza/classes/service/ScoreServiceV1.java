package com.gmail.gaeballza.classes.service;

import java.util.Scanner;

import com.gmail.gaeballza.classes.utils.Line;

public class ScoreServiceV1 {

	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner scan;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		scan = new Scanner(System.in);
	}

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("������ �� ����ó�� v1");
		System.out.println(Line.sLine(lineLength));

		int index = 0;
		for (index = 0; index < students.length; index++) {
			int stNum = index + 1;
			
			System.out.printf("%d �� �л� �̸�(END:�ߴ�) : ", stNum);
			
			String strName = scan.nextLine();
			if (strName.equals("END")) {
				break;
			}
			students[index] = strName;
			System.out.printf("%d �� �������� : >", stNum);

			String strScore = scan.nextLine();
			int intScore = 0;
			if (strScore.equals("")) {
				System.out.println("������ ���ڸ� ����");
			} else {
				intScore = Integer.valueOf(intScore);
			}
			intKor[index] = intScore;
		}
		return 0;

	}
	
	public void print() {
		for(int i = 0; i < students.length; i ++) {
			System.out.printf("%s\t", students[i]);
		}
		System.out.println();
		System.out.println(Line.dLine(lineLength));
	}
			
}
