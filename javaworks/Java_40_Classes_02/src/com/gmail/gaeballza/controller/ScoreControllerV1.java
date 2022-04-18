package com.gmail.gaeballza.controller;

import com.gmail.gaeballza.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		ScoreServiceV1 scServiceV1 = new ScoreServiceV1(5);
		int intResult = scServiceV1.input();
		if (intResult < 0) {
			System.out.println("입력 중단");
		} else {
			System.out.println("입력 완료");
		}

	}

}
