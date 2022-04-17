package com.gmail.gaeballza.arrays.controller;

import com.gmail.gaeballza.arrays.service.StudentServiceV2;

public class StudentControllerV2 {

	public static void main(String[] args) {
		StudentServiceV2 stServiceV2 = new StudentServiceV2(5);
		
		stServiceV2.inputStudent();
		stServiceV2.printStudent();

	}

}
