package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Todo;
import com.springboot.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> getAllTodos() {

		return todoRepository.findAll();
	}

	@Override
	public void saveTodo(Todo todo) {
		this.todoRepository.save(todo);
		
	}
	
	@Override
	public void deleteTodoById(long id) {
		this.todoRepository.deleteById(id);
		
	}
	
	@Override
	public Todo getTodoById(long id) {
		Optional < Todo > optional = todoRepository.findById(id);
		Todo todo = null;
		
	    if (optional.isPresent()) {
	        todo = optional.get();
	    } else {
	        throw new RuntimeException(" Todo not found for id : " + id);
	    }
	    return todo;
	}

	

}
