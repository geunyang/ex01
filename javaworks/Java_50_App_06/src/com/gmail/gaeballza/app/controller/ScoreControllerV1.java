package com.gmail.gaeballza.app.controller;

import com.gmail.gaeballza.app.service.ScoreService;
import com.gmail.gaeballza.app.service.impl.ScoreServiceImplV1;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore();
		scService.printScore();
	}

}
