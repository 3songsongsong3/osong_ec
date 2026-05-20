package com.ec.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *　ユーザー機能コントロラ
 *
 * @author Eugene
 */
@Controller
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/regUser")
	public String getUserRegPage(Model model) {
		
		return "user_reg";
	}

}
