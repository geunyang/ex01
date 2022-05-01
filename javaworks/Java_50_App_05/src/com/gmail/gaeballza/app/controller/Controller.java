package com.gmail.gaeballza.app.controller;

import com.gmail.gaeballza.app.service.ScoreService;

public class Controller {

	public static void main(String[] args) {
		
		ScoreService scService = new ScoreService();
		
		scService.makeScore();
		scService.scorePrint();

	}

}
