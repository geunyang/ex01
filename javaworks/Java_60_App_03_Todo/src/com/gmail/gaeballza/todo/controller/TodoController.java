package com.gmail.gaeballza.todo.controller;

import java.util.List;

import com.gmail.gaeballza.todo.model.TodoVO;
import com.gmail.gaeballza.todo.service.TodoService;
import com.gmail.gaeballza.todo.service.impl.TodoServiceImplV1;

public class TodoController {
	
	public static void main(String[] args) {
		
		TodoService tService = new TodoServiceImplV1();
		tService.todoInsert("오늘은 화요일");
		
		List<TodoVO> todoList =  tService.todoSelectAll();
		
		for(TodoVO tVO : todoList) {
			System.out.println(tVO.toString());
		}
		
	}

}
