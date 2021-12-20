package com.niyuj.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class LoginController {
	
	@GetMapping("/welcome")
	public String welcomeapi() {
		
		return "welcome user!";
	}
}
