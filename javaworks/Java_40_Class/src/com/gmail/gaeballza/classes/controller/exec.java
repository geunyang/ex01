package com.gmail.gaeballza.classes.controller;

import java.util.Scanner;

public class exec {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է� >");
		String strNum = scan.nextLine();
		int intNum = 0;
		if (strNum.equals("")) {
			System.out.println("���ڸ� �Է��ϼ���.");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		System.out.println("���ڿ��Է� > ");

		String strValue = scan.nextLine();
		System.out.println("�Էµ� ����: " + intNum);
		System.out.println("�Էµ� ���ڿ�: " + strValue);

	}

}
