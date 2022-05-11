package com.gmail.gaeballza.todo.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.gmail.gaeballza.todo.model.TodoVO;
import com.gmail.gaeballza.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService {

	private final List<TodoVO> todoList;

	public TodoServiceImplV1() {
		todoList = new ArrayList<>();
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
		if(todoList.get(num - 1).getEDate() == null || todoList.get(num - 1).getEDate().isEmpty()) {
		Date curDate = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");

		String today = dateFormat.format(curDate);
		String time = timeFormat.format(curDate);

		todoList.get(num - 1).setEDate(today);
		todoList.get(num - 1).setETime(time);
		}

	}

	@Override
	public void saveTodo(String fileName) {
		// TODO Auto-generated method stub

	}

}
