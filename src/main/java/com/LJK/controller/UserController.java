package com.LJK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.LJK.service.UserService;

@Controller
@RequestMapping(value = "/test")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	// index 实际上就是我们设置的 切点
	public String index() {
		userService.sayHello("LJK");
		return "index_2";
	}
}
