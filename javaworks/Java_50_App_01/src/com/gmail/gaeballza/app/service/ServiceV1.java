package com.gmail.gaeballza.app.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceV1 {
	
	private final List<Integer> intList;
	
	public ServiceV1() {
		intList = new ArrayList<>();
	}
	
	public void makeScore() {
		
		for (int i = 0; i < 10; i++) {
			int rnd = (int)(Math.random() * 100) + 1;
			intList.add(rnd);
		}
	}
	
	public List<Integer> getIntList() {
		return intList;
	}

}
