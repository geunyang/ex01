package com.gmail.gaeballza.arrays;

public class ArraysV3 {

	public static void main(String[] args) {
		int[] intNums = new int[5];
		int index = 0;
		
		intNums[index ++] = (int)(Math.random() * 100) +1;
		intNums[index ++] = (int)(Math.random() * 100) +1;
		intNums[index ++] = (int)(Math.random() * 100) +1;
		intNums[index ++] = (int)(Math.random() * 100) +1;
		intNums[index ++] = (int)(Math.random() * 100) +1;
		
		for(index = 0; index < 5 ; index++) {
			intNums[index] = (int)(Math.random() * 100) +1;
		}
		
		int[] intScore = new int[100];
		for(index = 0 ; index < 100 ; index ++) {
			intScore[index] = (int)(Math.random() * 100) +1;
		}
		
		for(index = 0 ; index < intScore.length ; index ++) {
			intScore[index] = (int)(Math.random() * 100) +1;
		}
		
		int intSum = intScore[0];
		intSum += intScore[2];
		System.out.println(intSum);
		
		intSum = 0;
		
		for(index = 0 ; index < intScore.length ; index ++) {
			intSum += intScore[index];
		}
		System.out.println("ÃÑÇÕ : " + intSum);
		
		float floatAverage = (float)intSum / (float)intScore.length;
		System.out.println("Æò±Õ : " + floatAverage);

	}

}
