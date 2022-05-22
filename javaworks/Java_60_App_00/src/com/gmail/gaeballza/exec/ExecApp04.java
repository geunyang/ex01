package com.gmail.gaeballza.exec;

public class ExecApp04 {
	public static void main(String[] args) {
		int num = 0;
		num = (int) (Math.random() * 100) + 1;
		if(num % 2 == 0) {
			System.out.println(num + "는(은) 짝수");
		} else {
			System.out.println(num + "는(은) 짝수가 아니다");
		}
	}

}
