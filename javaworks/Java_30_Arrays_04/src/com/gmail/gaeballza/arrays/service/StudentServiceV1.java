package com.gmail.gaeballza.arrays.service;

import java.util.Scanner;

import com.gmail.gaeballza.arrays.utils.Line;

public class StudentServiceV1 {

	protected String[] strStudents;
	protected Scanner scan;

	public StudentServiceV1() {
		/*
		 * strStudents = new String[10]; scan = new Scanner(System.in);
		 */
		this(10);
	}

	public StudentServiceV1(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);

	}

	public int inputStudent() {
		System.out.println( Line.dLine(50));
		System.out.println("�л� �̸� �Է�");
		System.out.println( Line.sLine(50));
		for (int i = 0; i < strStudents.length; i++) {

			System.out.printf("%d �� �л��̸� >", i + 1);
			String strName = scan.nextLine();
			strStudents[i] = strName;

			this.printStudent();
			System.out.println( Line.sLine(50));
			
		}
		System.out.println("�Է��� ���� �Ǿ����ϴ�");
		System.out.println( Line.dLine(50));
		return 0;
	}

	public void printStudent() {
		for (int i = 0; i < strStudents.length; i++) {
			boolean bYes = strStudents[i] == null;
			if (bYes) {
				break;
			}
			System.out.printf("%s\t", strStudents[i]);
		}
		System.out.println();
	}

}
