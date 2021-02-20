package com.springboot.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "todo")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "targetDate")
	private LocalDate targetDate;
	
	@Column(name = "status")
	private boolean status;

	public Todo(Long id, String title, String description, LocalDate targetDate, boolean status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.targetDate = targetDate;
		this.status = status;
	}

	public Todo(String title, String description, LocalDate targetDate, boolean status) {
		super();
		this.title = title;
		this.description = description;
		this.targetDate = targetDate;
		this.status = status;
	}

	public Todo() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
