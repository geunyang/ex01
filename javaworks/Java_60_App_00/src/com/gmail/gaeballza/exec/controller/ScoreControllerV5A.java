package com.gmail.gaeballza.exec.controller;

import com.gmail.gaeballza.exec.service.ScoreServiceV5A;

public class ScoreControllerV5A {
	public static void main(String[] args) {
		ScoreServiceV5A scServiceV5A =  new ScoreServiceV5A(100);
		scServiceV5A.makeScore();
		scServiceV5A.printScore();
		scServiceV5A.sumScore();
	}

}
