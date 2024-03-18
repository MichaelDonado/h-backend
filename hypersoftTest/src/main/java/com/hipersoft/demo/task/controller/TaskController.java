package com.hipersoft.demo.task.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.hipersoft.demo.task.interfaceService.TaskService;
import com.hipersoft.demo.task.model.Task;
import com.hipersoft.demo.task.model.TaskIdRequest;
import com.hipersoft.demo.user.model.UserIdRequest;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	@GetMapping("/getById")
	public Task getTaskById(@RequestBody TaskIdRequest request) {
		Long taskId = request.getTaskId();
		return taskService.getTaskById(taskId);
	}

	@PostMapping
	public Task createTask(@RequestBody Task task) {
		return taskService.createTask(task);
	}

	@PostMapping("/update")
	public Task updateTask(@RequestBody Task task) {
		return taskService.updateTask(task);
	}
	
	@PostMapping("/delete")
	public String deleteTask(@RequestBody TaskIdRequest request) {
	    Long taskId = request.getTaskId();
	    return taskService.deleteTask(taskId);
	}

}
