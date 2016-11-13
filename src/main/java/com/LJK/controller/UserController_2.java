package com.LJK.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LJK.entity.User_2;
import com.LJK.service.UserService_2;
import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/user_2")
public class UserController_2 {

	@Autowired
	private UserService_2 userService_2;

	/**
	 * 获取用户
	 */
	@RequestMapping("/getUserList")
	public void getJson(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User_2 user_2 = userService_2.searchById("1");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(JSON.toJSONString(user_2));
		out.flush();
		out.close();
	}
}