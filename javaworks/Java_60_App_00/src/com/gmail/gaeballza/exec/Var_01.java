package com.gmail.gaeballza.exec;

public class Var_01 {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		num1 = 55;
		num2 = 33;
		int add = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		
		System.out.printf("%d + %d = %d\n", num1, num2, add);
		System.out.printf("%d - %d = %d\n", num1, num2, sub);
		System.out.printf("%d × %d = %d\n", num1, num2, multi);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, div);
	}

}
