package com.springboot.service;
import java.util.List;

import com.springboot.model.Todo;

public interface TodoService {
	List <Todo> getAllTodos();
	Todo getTodoById(long id);
	void saveTodo(Todo todo);
	void deleteTodoById(long id);
	
}
