package com.LJK.service.impl;

import org.springframework.stereotype.Service;

import com.LJK.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	// @Override
	// public void addUser() throws Exception {
	// System.out.println("新增用户");
	// }

	@Override
	public void sayHello(String name) {
		System.out.println("hello，" + name);
	}
}