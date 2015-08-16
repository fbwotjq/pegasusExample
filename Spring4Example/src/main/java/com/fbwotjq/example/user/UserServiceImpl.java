package com.fbwotjq.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbwotjq.example.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserMapper userMapper;
	
	@Override
	public void inserUser(User user) {
		userMapper.insertUser(user);
	}
	
}
