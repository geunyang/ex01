package com.gmail.gaeballza;

public class Var_11 {

	public static void main(String[] args) {
		//1~100
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		
		boolean bCompare = true;
		bCompare = intNum1 > intNum2;
		
		if(bCompare) {
			System.out.println(intNum1 + "��" + intNum2 + "���� ũ��");
		} else {
			System.out.println(intNum1 + "��" + intNum2 + "���� ũ�� �ʴ�");
		}
		
		if(bCompare) {
			System.out.printf(" %d �� %d ���� ũ��\n", intNum1, intNum2); 
		} else {
			System.out.printf(" %d �� %d ���� ũ�� �ʴ�\n", intNum1, intNum2);
		}
		
		
		
		
		
		
		
		
	}

}
