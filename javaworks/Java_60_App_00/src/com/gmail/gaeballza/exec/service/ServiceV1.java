package com.gmail.gaeballza.exec.service;

public class ServiceV1 {
	public int scoreSum() {
		int intKor = (int) (Math.random() * 100) + 1;
		int intEng = (int) (Math.random() * 100) + 1;
		int intMath = (int) (Math.random() * 100) + 1;
		
		int sum = 0;
		sum = intKor;
		sum += intEng;
		sum += intMath;

		return sum;
//		System.out.println(intKor+intEng+intMath);

	}
}
