package com.gmail.gaeballza.todo.service;

import java.io.IOException;
import java.util.List;

import com.gmail.gaeballza.todo.model.TodoVO;

public interface TodoService {
	public void todoInsert(String content);
	public List<TodoVO> todoSelectAll();
	public void findByKey(String key);
	public void update(TodoVO tVO);
	public void compTodo(Integer num);
	public void saveTodo(String fileName) throws IOException;
}
