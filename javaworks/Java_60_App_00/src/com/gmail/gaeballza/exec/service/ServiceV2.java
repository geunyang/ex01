package com.gmail.gaeballza.exec.service;

public class ServiceV2 {
	
	public void guguDan() {
		int dan = 3;
		int index = 0;
		for(index = 1; index < 10; index ++) {
			System.out.printf("%d × %d = %d\n", dan, index, dan * index);
		}
	}

	public void guguDan(int dan) {
		// TODO Auto-generated method stub
		int index = 1;
		for(; index < 10; index ++) {
			System.out.print("\t");
			System.out.print(dan);
			System.out.print("*");
			System.out.print(index);
			System.out.print("=");
			System.out.print(dan*index);
		}
	}

}
