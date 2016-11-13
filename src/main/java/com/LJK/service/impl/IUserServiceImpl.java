package com.LJK.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.LJK.dao.UserDao;
import com.LJK.entity.User;
import com.LJK.service.IUserService;

@Service("IuserService")
public class IUserServiceImpl implements IUserService {
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		User user = this.userDao.selectByPrimaryKey(userId);
		return user;
	}
}