package com.gmail.gaeballza;

public class Var_02 {
	public static void main(String[] args) {
		
		int intNum1 = 0;
		intNum1 = num1();
		System.out.println(intNum1);
		
		int intNum2 = 0;
		intNum2 = add();
		System.out.println(intNum2);
		
	}//end main()
	public static int num1() {
		return 100;
	}
	
	public static int add( ) {
		return 55 + 33;
	}
}
