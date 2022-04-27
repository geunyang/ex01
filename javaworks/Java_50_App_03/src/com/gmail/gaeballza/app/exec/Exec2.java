package com.gmail.gaeballza.app.exec;

public class Exec2 {

	public static void main(String[] args) {

		int[] intNums = new int[10];
		for (int i = 0; i < intNums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			intNums[i] = num;
		}
		int intSum = 0;
		for (int i = 0; i < intNums.length; i++) {
			intSum += intNums[i];
		}
		System.out.println(intSum);
		
		//확장 for() 이용
		intSum = 0;
		for (int i : intNums) {
			intSum += i;
		}
		System.out.println(intSum);
	}

}
