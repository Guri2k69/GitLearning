package com.niyuj.group.controller;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class UserMap {
	
	private static HashMap<String,String> map= new HashMap<String,String>();

	public static HashMap<String, String> getMap() {
		return map;
	}

	public static void setMap(HashMap<String, String> map) {
		UserMap.map = map;
	}
	{
	map.put("admin","admin");
	map.put("user1", "password1");
	map.put("user2", "password2");
	map.put("user3", "password3");
	map.put("user4", "password4");
	map.put("user5", "password5");
	map.put("user6", "password6");
	map.put("user7", "password7");
	map.put("user8", "password8");
	map.put("user9", "password9");
	map.put("user10", "password10");
	}
	public String login(String Username) {
		if(map.containsKey(Username)) {
			return Username+" "+"has looged in succefully";
		}
		else {
			return "you have entered wrong credentials";
		}
		
	}
}
