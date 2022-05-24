package com.gmail.gaeballza.service.impl;

import java.io.PrintStream;
import java.util.List;

import com.gmail.gaeballza.student.model.StudentVO;
import com.gmail.gaeballza.utils.Line;

public class StudentServiceImplV2 extends StudentServiceImplV1 {
	
	private final PrintStream ps;
	
	public StudentServiceImplV2(List<StudentVO> stdList, String fileName, PrintStream ps) {
		// TODO Auto-generated constructor stub
		super(stdList, fileName);
		this.ps = ps;
	}
	
	@Override
	public void printStudent() {
		printAndFileSaveStudent(ps);
	}

	protected void printAndFileSaveStudent(PrintStream ps) {
		PrintStream out = ps;
		out.println(Line.dLine(50));
		out.println("대한고교 학생정보");
		out.println(Line.dLine(50));
		
		out.println("학번\t이름\t학과\t학년\t전화번호");
		out.println(Line.sLine(50));
		
		for (StudentVO stVO : stdList) {
			out.printf("%s\t", stVO.getNum());
			out.printf("%s\t", stVO.getName());
			out.printf("%s\t", stVO.getDept());
			out.printf("%s\t", stVO.getGrade());
			out.printf("%s\n", stVO.getTel());
		}
		out.println(Line.dLine(50));
		out.close();
		ps.close();

		
	}
	
	
	
}
