package com.gmail.gaeballza.app.controller;

import java.util.List;

import com.gmail.gaeballza.app.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {
		ServiceV1 sV1 = new ServiceV1();
		sV1.makeScore();
		System.out.println(sV1.getIntList().toString());
		
		List<Integer> result = sV1.getIntList();
		System.out.println(result.toString());

	}

}
