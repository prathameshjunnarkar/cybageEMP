package com.cybage.messaging.platform.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cybage.messaging.platform.domain.Users;
import com.cybage.messaging.platform.service.UserService;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping (method=RequestMethod.POST)
	
	public @ResponseBody Users createUser(@RequestBody Users user){
		log.debug("In create User service.");
		return userService.saveOrUpdate(user);
	}
}
