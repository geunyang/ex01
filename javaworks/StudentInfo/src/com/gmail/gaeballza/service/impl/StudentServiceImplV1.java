package com.gmail.gaeballza.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gmail.gaeballza.service.StudentService;
import com.gmail.gaeballza.student.model.StudentVO;
import com.gmail.gaeballza.utils.Line;

public class StudentServiceImplV1 implements StudentService {
	
	protected final List<StudentVO> stdList;
	protected final String fileName;
	
	public StudentServiceImplV1() {
		
		this(new ArrayList<>(),"src/com/gmail/gaeballza/student/student.txt");
		
	}
	public StudentServiceImplV1(List<StudentVO> stdList, String fileName) {
		this.stdList = stdList;
		this.fileName = fileName;
		loadStudent();
		
	}
	
	protected void loadStudent() {
		InputStream is = null;
		Scanner file = null;
		
		try {
			is = new FileInputStream(fileName);
			file = new Scanner(is);
			
			while (file.hasNext()) {
				String line = file.nextLine();
				String[] strInfo = line.split(":");
				
				StudentVO stVO = StudentVO.builder()
						.num(strInfo[0])
						.name(strInfo[1])
						.dept(strInfo[2])
						.grade(Integer.valueOf(strInfo[3]))
						.tel(strInfo[4])
						.build();
				stdList.add(stVO);
			}
			file.close();
			is.close();
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이없음");
			return;
		} catch (IOException e) {
			System.out.println("IO 오류");
			return;
		} catch (Exception e) {
			System.out.println("원인을 알 수 없는 Exception");
			return;
		}
	}

	@Override
	public void inputStudent() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(Line.dLine(50));
			System.out.println("학생정보입력");
			System.out.println(Line.sLine(50));
			
			System.out.println("학번(QUIT:종료) >>");
			String num = scan.nextLine();
			if (num.equals("QUIT")) {
				break;
			}
			
			System.out.println("이름(QUIT:종료) >>");
			String name = scan.nextLine();
			if (name.equals("QUIT")) {
				break;
			}
			
			System.out.println("학과(QUIT:종료) >>");
			String dept = scan.nextLine();
			if (dept.equals("QUIT")) {
				break;
			}

			System.out.println("학년(QUIT:종료) >>");
			String strGrade = scan.nextLine();
			if (strGrade.equals("QUIT")) {
				break;
			}
			int intGrade = 0;
			try {
				intGrade = Integer.valueOf(strGrade);				
			} catch (Exception e) {
				System.out.println("학년은 숫자로 입력");
				continue;
			}
			
			System.out.println("학과(QUIT:종료) >>");
			String tel = scan.nextLine();
			if (tel.equals("QUIT")) {
				break;
			}
			StudentVO stVO = StudentVO.builder()
					.num(num)
					.name(name)
					.dept(dept)
					.grade(intGrade)
					.tel(tel)
					.build();
			stdList.add(stVO);
		}
		saveStudent();
		printStudent();
		
	}

	private void saveStudent() {
		OutputStream os = null;
		PrintWriter out = null;
		
		try {
			os = new FileOutputStream(fileName);
			out = new PrintWriter(os);
			for (StudentVO stVO : stdList) {
				out.printf("%s:", stVO.getNum());
				out.printf("%s:", stVO.getName());
				out.printf("%s:", stVO.getDept());
				out.printf("%s:", stVO.getGrade());
				out.printf("%s:", stVO.getTel());
			}
			out.flush();
			out.close();
			os.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		
	}
	@Override
	public void printStudent() {
		System.out.println(Line.dLine(50));
		System.out.println("대한고교 학생정보");
		System.out.println(Line.dLine(50));
		
		System.out.println("학번\t이름\t학과\t학년\t전화번호");
		System.out.println(Line.sLine(50));
		
		for (StudentVO stVO : stdList) {
			System.out.print(stVO.getNum() + "\t");
			System.out.print(stVO.getName() + "\t");
			System.out.print(stVO.getDept() + "\t");
			System.out.print(stVO.getGrade() + "\t");
			System.out.println(stVO.getTel() + "\t");
		}
		System.out.println(Line.dLine(50));
	}

}
