package com.gmail.gaeballza.app.exec;

public class Exec1 {
	
	public static void main(String[] args) {
		int pizza = 6;
		int num = (int) (Math.random() * 25) + 25;
		if (num % pizza == 0) {
			System.out.printf("인원  %d는 %d의 피자가 필요", num, num / pizza);
		} else {
			int pan = (num / pizza) +1;
			System.out.printf("인원 %d는 %d의 피자가 필요", num, pan);
		}
	}

}
