package com.gmail.gaeballza.exec.controller;

import com.gmail.gaeballza.exec.service.ServiceV3;

public class ControllerV3 {
	public static void main(String[] args) {
		ServiceV3 serviceV3 = new ServiceV3();
		serviceV3.scoreKorSum();
		System.out.println(serviceV3.scoreKorSum());
	}
}
