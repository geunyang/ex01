package com.gmail.gaeballza.exec;

public class Method_01 {
	public static void main(String[] args) {
		
		int sum = num();
		System.out.println(sum);
		
	}
	public static int num() {
		int num1 = (int)(Math.random()*100) +1;
		int num2 = (int)(Math.random()*100) +1;
		return num1 + num2;
	}
}
