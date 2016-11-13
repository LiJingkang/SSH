package com.LJK.service;

import com.LJK.entity.User_2;

public interface UserService_2 {

	User_2 searchById(String id);

	int insert(User_2 user);

	int delete(String id);
}