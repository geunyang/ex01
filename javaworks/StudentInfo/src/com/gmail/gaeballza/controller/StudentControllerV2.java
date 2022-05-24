package com.gmail.gaeballza.controller;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.gmail.gaeballza.service.StudentService;
import com.gmail.gaeballza.service.impl.StudentServiceImplV2;
import com.gmail.gaeballza.student.model.StudentVO;

public class StudentControllerV2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		List<StudentVO> stdList = new ArrayList<>();
		String fileName = "src/com/gmail/gaeballza/student/student.txt";
		String printfile = "src/com/gmail/gaeballza/student/print.txt";
		PrintStream ps = new PrintStream(printfile);
		PrintStream psConsole = System.out;
		
		StudentService stService = new StudentServiceImplV2(stdList, fileName, ps);
		stService.printStudent();
		
		StudentService stService1 = new StudentServiceImplV2(stdList, fileName, System.out);
		stService1.printStudent();
	}

}
