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
		System.out.println("�츮 �� ���� ó�� V1");
		System.out.println(Line.sLine(lineLength));

		int index = 0;
		while (index < student.length) {

			System.out.print("�̸�(END:�ߴ�) >>");
			String strName = scan.nextLine();
			if (strName.equals("END")) {
				return -1;
			}

			System.out.print("����(END:�ߴ�) >>");
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
				System.out.println("�Է��� ��\"" + strKor + "\"�� ������ ���� �Ұ�");
				System.out.println("������ ������ �Է� ����");
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
