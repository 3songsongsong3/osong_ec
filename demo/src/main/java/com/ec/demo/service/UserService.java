package com.ec.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ec.demo.dto.UserDto;
import com.ec.demo.entity.User;
import com.ec.demo.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> findAll() {
        return userRepository.findAll()
        		.stream()
        		.map(UserDto::from)
        		.toList();
    }
    
    public User findById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }
    
    public void save(User dto) {
    	userRepository.save(dto);
    }
    
    
}
