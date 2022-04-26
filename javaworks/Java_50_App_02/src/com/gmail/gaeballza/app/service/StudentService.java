package com.gmail.gaeballza.app.service;

import java.util.List;

import com.gmail.gaeballza.app.domain.StudentVO;


public interface StudentService {
	
	public void loadStudent();
	public List<StudentVO> getStudents();
	public StudentVO findByStNum(String stNum);
	public List<StudentVO> findByStName(String stName);

}