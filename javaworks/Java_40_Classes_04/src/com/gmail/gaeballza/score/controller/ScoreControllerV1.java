package com.gmail.gaeballza.score.controller;

import com.gmail.gaeballza.classes.service.impl.ScoreServiceImplV1;
import com.gmail.gaeballza.classes.service.impl.StudentServiceImplV1;
import com.gmail.gaeballza.score.domain.StudentVO;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {

		String stFile = "src/com/gmail/gaeballza/score/data/student.txt";
		int stLength = 50;
		
		StudentServiceImplV1 stService1 = new StudentServiceImplV1(stFile, stLength);
		
		stService1.loadStudent();
		StudentVO[] stList = stService1.getStudents();
		StudentVO stNo1 = stService1.findByNum("0001");
		
		ScoreServiceImplV1 scServiceV1 = new ScoreServiceImplV1();
		scServiceV1.makeScore();
		int intSum = scServiceV1.retSum();
		float fAvg = scServiceV1.retAvg();
		scServiceV1.printScore();
		
	}

}
