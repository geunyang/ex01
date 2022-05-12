package com.gmail.gaeballza.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.gmail.gaeballza.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1 {
	
	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}

	protected void loadTodoList() {
		
		FileInputStream is = null;
		Scanner scan = null;
		try {

			is = new FileInputStream(saveFileName);
			
		} catch (FileNotFoundException e) {
			
			System.out.println(saveFileName + "파일을 찾을 수 없습니다");
			return;
		}
		
		scan = new Scanner(is);
		//26e4af23-16d2-446a-98d5-2cb099e9573c,2022-05-12,08:37:33,null,null,G
		int T_KEY = 0;
		int C_DATE = 1;
		int C_TIME = 2;
		int E_DATE = 3;
		int E_TIME = 4;
		int T_CONTENT = 5;
		
		while(scan.hasNext()) {
			// 파일에서 한줄씩 읽어오기
			String line = scan.nextLine();
			// 결과를 , 를 기준으로 분해
			String[] todo = line.split(",");
			
			// text 파일에 데이터를 저장하면 마지막에 공백이 추가되어 배열 개수가 부족하다?
			
			if(todo.length < T_CONTENT +1) continue;
			String eDate = todo[E_DATE];
			String eTime = todo[E_TIME];
			
			if(eDate.equalsIgnoreCase("null")) eDate = null;
			if(eTime.equalsIgnoreCase("null")) eTime = null;
			
			TodoVO tVO = TodoVO.builder()
						.tKey(todo[T_KEY])
						.sDate(todo[C_DATE])
						.sTime(todo[C_TIME])
						.eDate(eDate)
						.eTime(eTime)
						.tContent(todo[T_CONTENT])
						.build();
			todoList.add(tVO);
			
		}
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scan.close();
	}
	
	
}
