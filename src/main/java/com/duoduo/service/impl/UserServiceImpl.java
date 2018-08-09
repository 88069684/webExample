package com.duoduo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duoduo.dao.UserDao;
import com.duoduo.dao.entity.User;
import com.duoduo.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource UserDao userDao;
	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		User user = userDao.selectByPrimaryKey(userId);
		return user;
	}

}
