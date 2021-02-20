package com.springboot.service;
import java.util.List;

import com.springboot.model.Todo;

public interface TodoService {
	List <Todo> getAllTodos();
	void saveTodo(Todo todo);
	void deleteTodoById(long id);
	
}
