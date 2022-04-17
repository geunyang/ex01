package com.gmail.gaeballza.classes.controller;

import java.util.Scanner;

public class exec {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 >");
		String strNum = scan.nextLine();
		int intNum = 0;
		if (strNum.equals("")) {
			System.out.println("숫자만 입력하세요.");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		System.out.println("문자열입력 > ");

		String strValue = scan.nextLine();
		System.out.println("입력된 정수: " + intNum);
		System.out.println("입력된 문자열: " + strValue);

	}

}
