package com.gmail.gaeballza.classes.service;

import com.gmail.gaeballza.score.domain.StudentVO;
	
	/*
	 * student.txt 파일 읽어서 학생 데이터들 만들기
	 * 생성된 학생 데이터들을 return 해주기
	 * 학번을 argument로 받아서 해당 학생 데이터를 return 해주기
	 */
	
public interface StudentService {
		
		public void loadStudent();
		public StudentVO[] getStudents();
		/*
		 * stNum 학번을 학생 데이터들에서 찾아서(findByNum)
		 * 학생 데이터를 return 하기
		 */
		public StudentVO findByNum(String stNum);
		
	}
