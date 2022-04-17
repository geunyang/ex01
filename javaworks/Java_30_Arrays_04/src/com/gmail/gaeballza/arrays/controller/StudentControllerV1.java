package com.gmail.gaeballza.arrays.controller;

import com.gmail.gaeballza.arrays.service.StudentServiceV1;

public class StudentControllerV1 {

	public static void main(String[] args) {
		StudentServiceV1 stServiceV1 = new StudentServiceV1();
		StudentServiceV1 stService = new StudentServiceV1(5);
		
		stService.inputStudent();
		stService.printStudent();

	}

}
