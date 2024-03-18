package com.hipersoft.demo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hipersoft.demo.user.interfaceService.UserService;
import com.hipersoft.demo.user.interfaces.UserRepository;
import com.hipersoft.demo.user.model.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.orElse(null);
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User userUpdated) {
		return userRepository.save(userUpdated);
	}

	@Override
	public String deleteUser(Long userId) {
		userRepository.deleteById(userId);
		return "User removed";
	}

}
