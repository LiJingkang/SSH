package com.LJK.dao;

import org.apache.ibatis.annotations.Param;

import com.LJK.entity.User_2;

public interface UserDao_2 {

	int deleteByPrimaryKey(@Param(value = "id") String id);

	int insert(User_2 user);

	User_2 selectByPrimaryKey(@Param(value = "id") String id);
}