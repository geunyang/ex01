package com.gmail.gaeballza.app.exec;

public class Exec4 {

	public static void main(String[] args) {
		
		int intNum = (int)(Math.random() * 100) +1;
		int count = 0;
		for (int i = 2; i < intNum; i ++) {
			if((intNum % i == 0)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(intNum + " 는(은) 소수 입니다.");
		} else {
			System.out.println(intNum + " 는 (은) 소수가 아닙니다.");
		}
		
	}
	
}
