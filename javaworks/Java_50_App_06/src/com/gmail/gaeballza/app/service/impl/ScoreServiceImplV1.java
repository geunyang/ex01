package com.gmail.gaeballza.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.gmail.gaeballza.app.model.ScoreVO;
import com.gmail.gaeballza.app.service.ScoreService;
import com.gmail.gaeballza.utils.Line;

public class ScoreServiceImplV1 implements ScoreService {
	
	private final List<ScoreVO> scList;
	
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}
	

	@Override
	public void makeScore() {
		
		for(int i = 0; i < 20; i ++) {
			int intKor = (int) (Math.random() * 50) +51;
			int intEng = (int) (Math.random() * 50) +51;
			int intMath = (int) (Math.random() * 50) +51;
			
			ScoreVO scVO = new ScoreVO();
			scVO.setIntStNum(i + 1);
			scVO.setIntScKor(intKor);
			scVO.setIntScEng(intEng);
			scVO.setIntScMath(intMath);
			
			int intSum = intKor + intEng + intMath;
			float fAvg = (float) intSum / 3;
			scVO.setIntSum(intSum);
			scVO.setfAvg(fAvg);
			
			scList.add(scVO);

		}
		
	}

	@Override
	public void printScore() {
		
		int size = scList.size();
		int lineLength = 50;
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("중앙여고 성적 일람표");
		System.out.println(Line.sLine(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(lineLength));
		
		int[] intTotal = new int[4];
		int I_KOR = 0;
		int I_ENG = 1;
		int I_MATH = 2;
		int I_SUM = 3;
		
		for (int i = 0; i < size; i ++) {
			ScoreVO scVO = scList.get(i);
			System.out.printf("%4d\t", scVO.getIntStNum());
			System.out.printf("%4d\t", scVO.getIntScKor());
			System.out.printf("%4d\t", scVO.getIntScEng());
			System.out.printf("%4d\t", scVO.getIntScMath());
			System.out.printf("%4d\t", scVO.getIntSum());
			System.out.printf("%2.2f\n", scVO.getfAvg());			
			
			intTotal[I_KOR] += scVO.getIntScKor();
			intTotal[I_ENG] += scVO.getIntScEng();
			intTotal[I_MATH] += scVO.getIntScMath();
			intTotal[I_SUM] += scVO.getIntSum();			
			
		}
		
		System.out.println(Line.sLine(lineLength));
		System.out.printf("총점\t%4d\t%4d\t%4d\t%4d\n", intTotal[I_KOR],intTotal[I_ENG],intTotal[I_MATH],	intTotal[I_SUM] );
		System.out.println(Line.dLine(lineLength));
		
		
	}

}
