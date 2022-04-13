package com.gmail.gaeballza.array.controller;

import com.gmail.gaeballza.array.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		
		ScoreServiceV1 scoreServiceV1 = new ScoreServiceV1();
		scoreServiceV1.makeScore();
		scoreServiceV1.printScore();
		scoreServiceV1.sumScore();

	}

}
