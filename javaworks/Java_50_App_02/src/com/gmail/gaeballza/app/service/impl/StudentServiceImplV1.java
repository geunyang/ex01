package com.gmail.gaeballza.app.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gmail.gaeballza.app.domain.StudentVO;
import com.gmail.gaeballza.app.service.StudentService;
import com.gmail.gaeballza.app.utils.IndexInfo;

public class StudentServiceImplV1 implements StudentService {

	private final List<StudentVO> stList;
	private final String stFileName;

	public StudentServiceImplV1() {
		List<StudentVO> sts = new ArrayList<>();
		this.stList = sts;
		this.stFileName = "";
	}

	public StudentServiceImplV1(List<StudentVO> stList, String stFileName) {

		this.stList = stList;
		this.stFileName = stFileName;

	}

	@Override
	public void loadStudent() {
		InputStream is = null;
		try {
			is = new FileInputStream(this.stFileName);
		} catch (FileNotFoundException e) {
			System.out.println(stFileName + "파일을 찾을 수 없습니다.");
			return;
		}
		Scanner fileRead = new Scanner(is);
		while (fileRead.hasNext()) {
			String stLine = fileRead.nextLine();
			String[] stInfo = stLine.split(":");

			String stNum = stInfo[IndexInfo.ST.ST_NUM];
			String stName = stInfo[IndexInfo.ST.ST_NAME];
			String stDept = stInfo[IndexInfo.ST.ST_DEPT];
			String stGrade = stInfo[IndexInfo.ST.ST_GRADE];
			int intGrade = Integer.valueOf(stGrade);
			String stAddr = stInfo[IndexInfo.ST.ST_ADDR];
			String stTel = stInfo[IndexInfo.ST.ST_TEL];

			StudentVO stVO = new StudentVO(stNum, stName, intGrade, stDept, stAddr, stTel);
			stList.add(stVO);

		}
		try {
			is.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		fileRead.close();

	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		return this.stList;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByStName(String stName) {
		// TODO Auto-generated method stub
		return null;
	}

}
