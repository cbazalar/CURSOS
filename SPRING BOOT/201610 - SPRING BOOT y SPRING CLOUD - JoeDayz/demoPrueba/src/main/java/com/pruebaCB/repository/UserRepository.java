package com.pruebaCB.repository;

import org.springframework.data.repository.CrudRepository;

import com.pruebaCB.modelo.User;


public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String name);
}
