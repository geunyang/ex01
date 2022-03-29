package com.gmail.gaeballza;

public class Var_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doNum1 = Math.random() * 1000 + 1;
		//doNum1 = doNum1 * 1000;
		doNum1 *= 1000;
		//doNum1에 담긴 값에 1을 더하여 다시 doNum1에 저장
		doNum1 ++;
		
		int intNum1 = (int)doNum1;
		
		double doNum2 = Math.random() * 1000 + 1;
		
		int intNum2 = (int)doNum2;
		
		int intSum = intNum1 + intNum2;
		int intDes = intNum1 - intNum2;
		int intMulti = intNum1 * intNum2;
		int intDiv = intNum1 / intNum2;
		
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2, intDes);
		System.out.printf("%d * %d = %d\n", intNum1, intNum2, intMulti);
		System.out.printf("%d / %d = %d\n", intNum1, intNum2, intDiv);
		
		
		
	}

}
