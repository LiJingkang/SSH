package com.LJK.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LJK.dao.UserDao_2;
import com.LJK.entity.User_2;
import com.LJK.service.UserService_2;

@Service("userService_2")
public class UserServiceImpl_2 implements UserService_2 {

	@Resource
	private UserDao_2 userDao_2;

	public User_2 searchById(String id) {
		return userDao_2.selectByPrimaryKey(id);
	}

	@Transactional
	public int insert(User_2 user) {
		return userDao_2.insert(user);
	}

	@Transactional
	public int delete(String id) {
		return userDao_2.deleteByPrimaryKey(id);
	}

}