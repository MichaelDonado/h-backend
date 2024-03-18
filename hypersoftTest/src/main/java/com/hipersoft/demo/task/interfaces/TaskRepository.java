package com.hipersoft.demo.task.interfaces;

import com.hipersoft.demo.task.model.Task;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
	List<Task> findAll();

	Optional<Task> findById(Long id);

	Task save(Task task);  
}
