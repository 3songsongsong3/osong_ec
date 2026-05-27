package com.ec.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ec.demo.dto.UserDto;
import com.ec.demo.entity.User;
import com.ec.demo.service.ProductService;
import com.ec.demo.service.UserService;

/**
 *　ユーザー機能コントロラ
 *
 * @author Eugene
 */
@Controller
@RequestMapping("/users")
public class UserController {
	
    private final UserService userService;
    
    public UserController(UserService userService) {
    	this.userService = userService;
    }
	
	@GetMapping("/regUser")
	public String getUserRegPage(Model model) {
		
		return "user_reg";
	}
	
	@PostMapping("/regUser")
	public String registerUser(@ModelAttribute UserDto userDto) {
		userService.save(userDto.toEntity());
		return "redirect:/";
	}
	
	@GetMapping("/list")
	@ResponseBody
	public List<UserDto> getUser() {
		return userService.findAll();
	}

}
