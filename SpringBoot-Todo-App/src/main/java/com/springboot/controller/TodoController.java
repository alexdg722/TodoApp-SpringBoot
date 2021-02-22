package com.springboot.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.springboot.model.Todo;
import com.springboot.repository.TodoRepository;
import com.springboot.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@Autowired
	private TodoRepository todoRepository;

	@GetMapping("/")
	public String viewTodos(Model model) {
		model.addAttribute("listTodos", todoService.getAllTodos());
		return "index";
	}
	
	@GetMapping("/showNewTodoForm")
	public String showNewTodoForm(Model model) {
		
		Todo todo = new Todo();
		model.addAttribute("todo", todo);
		return "new_todo";
	}
	
	@PostMapping("/saveTodo")
	public String saveTodo(@ModelAttribute("todo") Todo todo) {

		todoService.saveTodo(todo);
		return "redirect:/";
	}
	
	@GetMapping("deleteTodo/{id}")
	public String deleteTodo(@PathVariable (value = "id") long id) {
		this.todoService.deleteTodoById(id);
		  return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		Todo todo = todoService.getTodoById(id);
		model.addAttribute("todo", todo);
		return "update_todo";
	}
	
	
	

}
