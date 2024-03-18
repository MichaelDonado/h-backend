package com.hipersoft.demo.user.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hipersoft.demo.user.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	List<User> findAll();

	Optional<User> findById(Long id);

	User save(User user);

}
