package com.hipersoft.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hipersoft.demo.user.interfaceService.UserService;
import com.hipersoft.demo.user.model.User;
import com.hipersoft.demo.user.model.UserIdRequest;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/getById")
	public User getUserById(@RequestBody UserIdRequest request) {
		Long userId = request.getUserId();
		return userService.getUserById(userId);
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@PostMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@PostMapping("/delete")
	public String deleteUser(@RequestBody UserIdRequest request) {
	    Long userId = request.getUserId();
	    return userService.deleteUser(userId);
	}

}
