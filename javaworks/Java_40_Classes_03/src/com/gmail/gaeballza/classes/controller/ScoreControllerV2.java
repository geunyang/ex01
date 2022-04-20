package com.gmail.gaeballza.classes.controller;

import com.gmail.gaeballza.classes.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		
		String[] stNames = {"YOSHIDA","KIM","ALLEN","KAFKA","NGUYEN"};
		ScoreServiceV2 scService = new ScoreServiceV2(stNames);
		scService.makeScore();
		scService.printScore();

	}

}
