package com.gmail.gaeballza.arrays;

public class ArraysV1 {

	public static void main(String[] args) {
		int[] intNums = new int[10];
		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		intNums[9] = 100;
		
		System.out.println(intNums[2]);
		System.out.println(intNums[8]);
		
		int intSum = intNums[0];
		intSum += intNums[2];
		
		System.out.println(intSum);
		
		intNums[8] = intSum;
		intNums[6] = intNums[1] + intNums[2] + intNums[9];
		System.out.println(intNums[8]);
		System.out.println(intNums[6]);
		
		System.out.println(intNums.toString());
		System.out.println(intNums);
		

	}

}
