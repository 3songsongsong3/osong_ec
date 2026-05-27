package com.ec.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ec.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
