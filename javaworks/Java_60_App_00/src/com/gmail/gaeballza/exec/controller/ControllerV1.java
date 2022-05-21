package com.gmail.gaeballza.exec.controller;

import com.gmail.gaeballza.exec.service.ServiceV1;

public class ControllerV1 {
	public static void main(String[] args) {
		ServiceV1 serviceV1 = new ServiceV1();
		serviceV1.scoreSum();
		System.out.println(serviceV1.scoreSum());
	}
}
