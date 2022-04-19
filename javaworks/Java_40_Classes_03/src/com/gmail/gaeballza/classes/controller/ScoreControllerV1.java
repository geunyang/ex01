package com.gmail.gaeballza.classes.controller;

import com.gmail.gaeballza.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		String[] stNames = {"YOSHIDA","KIM","ALLEN","KAFKA","NGUYEN"};
		ScoreServiceV1 scService = new ScoreServiceV1(stNames);
		scService.makeScore();
		scService.printScore();
		scService.printAvg();

	}

}
