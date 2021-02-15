package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.springboot.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>,
	CrudRepository<Todo, Long>{

}
