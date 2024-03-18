package com.hipersoft.demo.task.interfaceService;

import java.util.List;

import com.hipersoft.demo.task.model.Task;

public interface TaskService {
	List<Task> getAllTasks();

	Task getTaskById(Long id);

	Task createTask(Task task);

	Task updateTask(Task task);

	String deleteTask(Long id); 
}
