package com.niyuj.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	ServiceLayer servicelayer;

	@RequestMapping(method=RequestMethod.POST, value="/login")
	public String loginApi() {
		servicelayer.login();
		return "Logged in Succsefuly";
	}
}
