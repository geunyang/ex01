package com.gmail.gaeballza.app.exec;

public class Exec1 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] > 54) {
				System.out.println(intNums[i]);
			}
		}
		for (int num : intNums) {
			if (num > 54) {
				System.out.println(num);
			}
		}
	}

}
