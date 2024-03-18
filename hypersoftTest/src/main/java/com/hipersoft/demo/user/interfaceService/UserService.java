package com.hipersoft.demo.user.interfaceService;

import java.util.List;

import com.hipersoft.demo.user.model.User;

public interface UserService {
	List<User> getAllUsers();

	User getUserById(Long id);

	User createUser(User user);

	User updateUser(User user);

	String deleteUser(Long id);
}
