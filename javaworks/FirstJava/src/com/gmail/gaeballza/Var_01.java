package com.gmail.gaeballza;

public class Var_01 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = 33;
		intNum2 = 99;
			
		int intSum = 0; 
		int intMinus = 0;
		int intMultiple = 0; 
		int intDivision = 0;
		
		intSum = intNum1 + intNum2;
		intMinus = intNum1 - intNum2;
		intMultiple = intNum1 * intNum2;
		intDivision = intNum1 / intNum2;
		
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("%d - %d = %d\n", intNum1, intNum2, intMinus);
		System.out.printf("%d ¡¿ %d = %d\n", intNum1, intNum2, intMultiple);
		System.out.printf("%d ¡À %d = %d\n", intNum1, intNum2, intDivision);

	}

}
