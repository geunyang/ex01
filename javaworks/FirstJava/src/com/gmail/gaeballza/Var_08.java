package com.gmail.gaeballza;

public class Var_08 {

	public static void main(String[] args) {
		
		// 1~1000���� ������ ������ �� 1���� �����Ͽ� intNum1�� ����
		int intNum1 = (int)(Math.random() * 1000) + 1;
		int intNum2 = (int)(Math.random() * 1000) + 1;
		
		System.out.printf("%d\n", intNum1);
		System.out.printf("%d\n", intNum2);
		
		System.out.println(" num1 > num2 " + (intNum1 > intNum2));
		System.out.println(" num1 < num2 " + (intNum1 < intNum2));
		System.out.println(" num1 == num2 " + (intNum1 == intNum2));
		
		System.out.println(" num1 <> num2 " + (intNum1 != intNum2));
		
		/*
		 * Literal ���� ��Ȯ�� Ȯ���� �� �ִ°�
		 * �Ϲ����� ���ڰ� "���ڿ�"
		 * Java���� ���ͷ��� ���ͷ��� �񱳿��� �ϴ°��� ���� �ǹ̰� ����
		 * ������ eclipse���� ���� �Ǵ� ��� �����ش�
		 */
		
		System.out.println(30 > 30);
		System.out.println(30 == 30);

	}

}
