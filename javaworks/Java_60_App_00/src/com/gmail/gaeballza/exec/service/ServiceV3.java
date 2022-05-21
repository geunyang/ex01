package com.gmail.gaeballza.exec.service;

public class ServiceV3 {
	public int scoreKorSum() {
		int[] intKor = new int[5];

		intKor[0] = (int) (Math.random() * 100) + 1;
		intKor[1] = (int) (Math.random() * 100) + 1;
		intKor[2] = (int) (Math.random() * 100) + 1;
		intKor[3] = (int) (Math.random() * 100) + 1;
		intKor[4] = (int) (Math.random() * 100) + 1;
		int sum = intKor[0];
		sum += intKor[1];
		sum += intKor[2];
		sum += intKor[3];
		sum += intKor[4];

		return sum;
	}
}
