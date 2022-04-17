package com.gmail.gaeballza.arrays.service;

import java.util.Scanner;

import com.gmail.gaeballza.arrays.utils.Line;

public class StudentServiceV2 extends StudentServiceV1 {

	protected String[] strStudents;
	protected Scanner scan;

	public StudentServiceV2() {

		this(10);
	}

	public StudentServiceV2(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);

	}

	@Override
	public int inputStudent() {

		System.out.println(Line.dLine(50));
		System.out.println("학생 정보 입력 v2");
		System.out.println(Line.sLine(50));

		int index = 0;
		for (index = 0; index < strStudents.length; index++) {
			System.out.printf(" %d 번 학생 입력(QUIT:중단) > ", index + 1);
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				break;
			}
			strStudents[index] = strName;
		}
		if (index < strStudents.length) {
			System.out.println("입력이 중단 되었습니다.");
		} else {
			System.out.println("입력을 모두 마쳤습니다.");
		}
		return 0;

	}

}
