package com.gmail.gaeballza.exec;

public class ExecV1 {
	public static void main(String[] args) {

		int nums = (int) (Math.random() * 100) +1;
		if(nums % 2 == 0) {
			System.out.println(nums + "은(는) 짝수입니다");
		} else {
			System.out.println(nums + "은(는) 짝수가 아닙니다");
		}
	}
}
