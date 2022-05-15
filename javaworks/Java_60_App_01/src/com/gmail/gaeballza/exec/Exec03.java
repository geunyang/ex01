package com.gmail.gaeballza.exec;
/*
 * 정수형 배열 10개 선언하고
 * 1~100까지 임의의 정수를 생성하여 배열에 저장
 * 배열 리스트를 보여주고
 * 배열에 저장된 정수들의 합을 구하여 console에 출력
 * 평균을 구하여 console 에 출력
 */
public class Exec03 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int intSum = 0;
		for(int i = 0; i < nums.length; i ++ ) {
			nums[i] = (int) (Math.random() * 100) + 1;
		} for(int num : nums) {
			System.out.println(num);
		} for(int num : nums) {
			intSum += num;
		} 
		System.out.println("합계 : " + intSum);
		float fAvg = (float) intSum / nums.length;
		System.out.println("평균 : " + fAvg);
	}

}
