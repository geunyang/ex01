package com.gmail.gaeballza.exec;

public class ExecApp01 {
	//배열생성과 출력 따로하기
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int) (Math.random() * 100) +1;
		}
		for(int i = 0; i < nums.length; i ++) {
			System.out.println(nums[i]);
			
		}
	}

}
