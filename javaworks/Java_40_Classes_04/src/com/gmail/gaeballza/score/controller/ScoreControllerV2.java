package com.gmail.gaeballza.score.controller;

import com.gmail.gaeballza.classes.service.ScoreService;
import com.gmail.gaeballza.classes.service.StudentService;
import com.gmail.gaeballza.classes.service.impl.ScoreServiceImplV1;
import com.gmail.gaeballza.classes.service.impl.StudentServiceImplV1;
import com.gmail.gaeballza.score.domain.StudentVO;

public class ScoreControllerV2 {
	public static void main(String[] args) {
		
		String stFile = "src/com/gmail/gaeballza/score/data/student.txt";
		int stLength = 50;
		StudentService stService = new StudentServiceImplV1(stFile, stLength);
		stService.loadStudent();
		StudentVO[] stList = stService.getStudents();
		StudentVO stNo1 = stService.findByNum("0001");
		
		/* 인터페이스를 상속 받아서 선언한 클래스일 경우는
		 * 인터페이스로 객체를 선언하고 실제 사용할 클래스의 생성자를 호출하여 인스턴스를 생성한다
		 * 즉, 인터페이스 객체 = new 클래스Impl()
		 */
		
		ScoreService scService = new ScoreServiceImplV1();
		scService.makeScore();
		scService.printScore();
		
	}

}
