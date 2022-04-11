package com.gmail.gaeballza.arrays.service;

public class ServiceV1 {
	int[] intKor;
	int[] intEng;
	
	public ServiceV1() {
		intKor = new int[10];
		intEng = new int[10];
		intKor[3] = 100;
		intEng[3] = 90;
		
	}
	public void viewKor3() {
		System.out.println(intKor[3]);
	}
	public void viewEng3() {
		System.out.println(intEng[3]);
	}
	
}
