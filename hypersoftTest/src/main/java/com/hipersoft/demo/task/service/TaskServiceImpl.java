package com.hipersoft.demo.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hipersoft.demo.task.interfaceService.TaskService;
import com.hipersoft.demo.task.interfaces.TaskRepository;
import com.hipersoft.demo.task.model.Task;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTaskById(Long id) {
		Optional<Task> optionalTask = taskRepository.findById(id);
        return optionalTask.orElse(null);
	}

	@Override
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public Task updateTask(Task taskUpdated) {
		return taskRepository.save(taskUpdated);
	}

	@Override
	public String deleteTask(Long taskId) {
		taskRepository.deleteById(taskId);
		return "Task removed";
	}

}
