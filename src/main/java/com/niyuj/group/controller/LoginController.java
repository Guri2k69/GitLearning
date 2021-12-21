package com.niyuj.group.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	UserMap userMap;
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@PostMapping("/restapi/login")
	public String loginApi(@RequestBody User user) {

		String username = user.getUsername();
		String password = user.getPassword();
		logger.info(username);// for debugging purposes
		logger.info(password);// for debugging purposes
		String loginMessage = userMap.login(username, password);
		return loginMessage;
	}

	@GetMapping("/restapi/rolecheck")
	public String roleCheck(@RequestHeader(value = "Role") String role) {
		if (role.equals("STUDENT")) {
			return "You are a Student so you can access list of only technology books.";
		} else if (role.equals("ADMIN")) {
			return "You are an admin so you can access list of all books.";
		} else {
			return "You have entered wrong header";
		}
	}

	@GetMapping("/restapi/getlist")
	public ArrayList<Books> getlist(@RequestHeader(value = "Role") String role) {

		ArrayList<Books> books = BookMap.getlist(role);

		return books;
	}
}
