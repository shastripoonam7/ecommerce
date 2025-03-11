package com.ecommerce.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.user.model.User;
import com.ecommerce.user.service.UserService;

@Controller
@RequestMapping("/ecommerce")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/products")
	public String products() {
		return "products";
	}
	
	@PostMapping("/loginUser")
	public String loginUser(@ModelAttribute("user") User user,Model model) {
		user = userService.findByUsername(user);
		model.addAttribute("success", "You are login successfully!");
		return "home";
		
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user,Model model) {
		User userSearch = userService.findByUsername(user);
		if(userSearch != null)
			model.addAttribute("error", "User name is present!");
		else {
			user = userService.createUser(user);
			model.addAttribute("success", "You are registered successfully!");
		}
		return "register";
	}


}
