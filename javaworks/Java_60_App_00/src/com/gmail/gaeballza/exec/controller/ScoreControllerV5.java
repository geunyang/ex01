package com.gmail.gaeballza.exec.controller;

import com.gmail.gaeballza.exec.service.ScoreServiceV5;

public class ScoreControllerV5 {
	
	public static void main(String[] args) {
		ScoreServiceV5 scServiceV5 = new ScoreServiceV5(100);
		scServiceV5.makeScore();
		scServiceV5.printScore();
		scServiceV5.sumScore();
	}

}
