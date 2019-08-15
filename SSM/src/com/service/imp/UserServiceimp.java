package com.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.service.UserService;

@Service
public class UserServiceimp implements UserService {
	@Autowired
	private com.dao.UserDao userDao;
	@Override
	public User check(User u){
		return userDao.check(u);
	}
}
