package com.gmail.gaeballza.arrays;

public class ArraysV7 {
	public static void main(String[] args) {
		int[] intNum = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intNum.length; i++) {
			boolean bEven = intNum[i] % 2 == 0;
			System.out.println(intNum[i]);
			if (bEven) {
				System.out.println("은(는) 짝수이다");
			} else {
				System.out.println("은(는) 짝수가 아니다");
			}
		}

	}

}
