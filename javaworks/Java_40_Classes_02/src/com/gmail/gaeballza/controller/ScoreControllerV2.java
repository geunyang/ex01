package com.gmail.gaeballza.controller;

import com.gmail.gaeballza.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		
		ScoreServiceV2 scServiceV2 = new ScoreServiceV2();
		scServiceV2 = new ScoreServiceV2(20);
		
		String[] strNames = {"anna","tsuyoshi","angel","meimei","hanul"};
		scServiceV2 = new ScoreServiceV2(strNames);
	}

}
