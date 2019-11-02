package com.praveen.springboot.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.praveen.springboot.web.model.Login;
import com.praveen.springboot.web.model.User;
import com.praveen.springboot.web.service.UserService;

@Controller
public class HomeController {



	@GetMapping("/")
	public String home(Map<String, Object> map) {
		return "home";
	}
	

	@GetMapping("/login")
	public String showLoginPage(ModelMap model) {
		model.addAttribute(new Login());

		return "login";
	}

	@GetMapping("/showRegistrationPage")
	public String showRegistrationPage(ModelMap model) {
		model.addAttribute(new User());

		return "registration";
	}

}
