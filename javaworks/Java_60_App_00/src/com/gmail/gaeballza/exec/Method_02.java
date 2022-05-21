package com.gmail.gaeballza.exec;

public class Method_02 {
	public static void main(String[] args) {
		
		int addResult = add();
		int mResult = multi();
		System.out.println(addResult + mResult);
		
	}
	
	public static int add() {
		int addNum1 = (int)(Math.random()*100) +1;
		int addNum2 = (int)(Math.random()*100) +1;
		return addNum1 + addNum2;
	}
	public static int multi() {
		int mNum1 = (int)(Math.random()*100) +1;
		int mNum2 = (int)(Math.random()*100) +1;
		return mNum1 * mNum2;
	}
}
