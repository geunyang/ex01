package com.gmail.gaeballza.todo.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.gmail.gaeballza.todo.model.TodoVO;
import com.gmail.gaeballza.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService {
	
	protected final String saveFileName;
	protected final List<TodoVO> todoList;

	public TodoServiceImplV1() {
		this("src/com/gmail/gaeballza/todo/model/todolist.txt");
	}
	public TodoServiceImplV1(String saveFileName) {
		todoList = new ArrayList<>();
		this.saveFileName = saveFileName;
	}

	@Override
	public void todoInsert(String content) {
		Date curDate = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);
		UUID uuid = UUID.randomUUID();
		String idStr = uuid.toString();

		TodoVO tVO = TodoVO.builder().tKey(idStr).sDate(today).tContent(content).sTime(time).build();
		todoList.add(tVO);
	}

	@Override
	public List<TodoVO> todoSelectAll() {
		// TODO Auto-generated method stub
		return todoList;
	}

	@Override
	public void findByKey(String key) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(TodoVO tVO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void compTodo(Integer num) {
		int index = num - 1;
		LocalDateTime local = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		DateTimeFormatter toDateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter toTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
		
		String edate = local.format(toDateFormat);
		String etime = local.format(toTimeFormat);
		
		try {
			TodoVO tVO = todoList.get(index);
			
			// todo의 edate 값이 null 이거나 "" 이면
			// 현재시각을 그대로 edate에 담고 
			// 그렇지 않으면 edate에 null을 담아라
			// 변수 = 조건 ? 참일때 : 거짓일때
			
			edate = tVO.getEDate() == null || tVO.getEDate().isEmpty() ? edate:null;
			etime = tVO.getETime() == null || tVO.getETime().isEmpty() ? etime:null;
			
			tVO.setEDate(edate);
			tVO.setETime(etime);
			
			
		} catch (Exception e) {
			System.out.println("TODO LIST 데이터 범위를 벗어났습니다");
		}
		

	}

	@Override
	public void saveTodo(String fileName) throws IOException {
		
		FileWriter writer = null;
		PrintWriter out = null;
		
		writer = new FileWriter(saveFileName);
		out = new PrintWriter(writer);
		for(TodoVO vo : todoList) {
			out.printf("%s,", vo.getTKey());
			out.printf("%s,", vo.getSDate());
			out.printf("%s,", vo.getSTime());
			out.printf("%s,", vo.getEDate());
			out.printf("%s,", vo.getETime());
			out.printf("%s\n", vo.getTContent());
			
		}
		out.flush();
		out.close();
		writer.close();

	}

}
