package com.LJK.service;

import org.springframework.stereotype.Service;

import com.LJK.entity.User;

@Service
public interface IUserService {
	public User getUserById(int userId);
}