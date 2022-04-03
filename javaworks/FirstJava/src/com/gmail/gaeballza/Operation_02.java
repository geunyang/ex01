package com.gmail.gaeballza;

public class Operation_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 0;
		int intNum2 = 0;
		
		System.out.println((intNum1 += 10) > 10);
		
		System.out.println(
				((intNum1 += 10) > 20) ||
				((intNum2 += 10) > 10)
		);
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		System.out.println(
				((intNum1 += 10) < 20) &&
				((intNum2 += 10) < 100)
		);
		
		
	}

}
