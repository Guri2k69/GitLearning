package com.niyuj.group.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	UserMap userMap;
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@PostMapping("/api/login")
	public String loginApi(@RequestBody User user) {

		String username = user.getUsername();
		String password = user.getPassword();
		logger.info(username);//for debugging purposes
		logger.info(password);//for debugging purposes
		String loginMessage = userMap.login(username, password);
		return loginMessage;
	}
}
